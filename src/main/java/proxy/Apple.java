package proxy;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射案例
 * @author Administrator
 *
 */
public class Apple {

    private int price;
    
    public Apple() {
		super();
	}

	public Apple(int price) {
		super();
		this.price = price;
	}

	public int getPrice() throws FileNotFoundException {
    	FileOutputStream a = new FileOutputStream("E:\\Youku Files\\f.text");
        return price;
    }

	public void setPrice(int price) {
    	System.out.println("设置price的值");
        this.price = price;
    }

    @Override
	public String toString() {
		return "Apple [price=" + price + "]";
	}

	public static void main(String[] args) throws Exception{ 
        //使用反射调用
        Class<?> clz = Class.forName("proxy.Apple");
        Constructor<?> con = clz.getConstructor(int.class);
        Object obj = con.newInstance(7876);
        System.out.println(obj);
        Method metset = clz.getDeclaredMethod("setPrice", int.class);
        metset.invoke(obj, 123);
        Method metget = clz.getDeclaredMethod("getPrice");
        System.out.println(metget.invoke(obj));
        Field field = clz.getDeclaredField("price");
        field.setAccessible(true);
        field.set(obj, 345);
        Object value = field.get(obj);
        System.out.println(value);
    }
}