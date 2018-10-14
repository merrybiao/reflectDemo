package proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Person {
	
	private String name;
	
	private String age;
	
	public Person() {
	
	}
	
	public Person(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAge() {
		return age;
	}



	public void setAge(String age) {
		this.age = age;
	}



	public String getName(String name1,String name2){
		
		return name1+name2;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}



	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("proxy.Person");
		Object per = clazz.newInstance();
		Method met = clazz.getMethod("getName", new Class[]{String.class,String.class});
		Object result = met.invoke(per, new String[]{"小黄","小红"});
		System.out.println(result);
		Object p = clazz.getConstructor(new Class[]{String.class,String.class}).newInstance("小明","20");
		System.out.println(p);
	}

}
