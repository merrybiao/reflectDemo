package test;

import com.alibaba.fastjson.JSONObject;

public class Key {

	public static void main(String[] args) {
		JSONObject json = new JSONObject();
		json.put("phone", "15827167589");
		json.put("msg", "【漪象游戏】您的验证码为：9t4u57，请不要转告他人，1分钟内有效。");
		json.put("type", "1");
		json.put("businessScenario", "1");
		System.out.println(SmsMD5Util.encoding(json.toString()));;
	}
}
