package br.com.yahoo.financas.util;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Util {
	
	public static String convertStringToJson(String string) {
		return new Gson().fromJson(string, JsonObject.class).toString();
	}
}
