package test;

import com.alibaba.fastjson.JSONObject;

public class Key {

	public static void main(String[] args) {
		JSONObject json = new JSONObject();
		json.put("phone", "15827167589");
		json.put("msg", "��������Ϸ��������֤��Ϊ��9t4u57���벻Ҫת�����ˣ�1��������Ч��");
		json.put("type", "1");
		json.put("businessScenario", "1");
		System.out.println(SmsMD5Util.encoding(json.toString()));;
	}
}
