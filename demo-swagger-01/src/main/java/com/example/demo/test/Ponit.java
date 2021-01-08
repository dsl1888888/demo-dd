package com.example.demo.test;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

public class Ponit {

	public static void main(String[] args) {

	}

	public static ArrayList<JSONObject> areaList;

	public static ArrayList<Map<String, String>> method(ArrayList<JSONObject> personList) throws JSONException {
		for (JSONObject jsonObject : areaList) {
			Double x = jsonObject.getDouble("x");
			Double y = jsonObject.getDouble("y");
			Double z = jsonObject.getDouble("z");
			Double x_len = jsonObject.getDouble("x-len");
			Double y_len = jsonObject.getDouble("y-len");
			Double z_len = jsonObject.getDouble("z-len");

			Double p_x = null;
			Double p_y = null;
			Double p_z = null;
			if ((Math.abs((x + x_len / 2) - p_x) < x_len / 2) && (Math.abs((y + y_len / 2) - p_y) < y_len / 2)
					&& (Math.abs((z + z_len / 2) - p_z) < z_len / 2)) {
			}

		}
		return null;
	}
}