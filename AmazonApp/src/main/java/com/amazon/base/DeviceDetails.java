package com.amazon.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.testng.annotations.Test;

public class DeviceDetails {

	public static String DSN;
	public static String Model;

		public static String getDSN() {
		try {
			Process pc = Runtime.getRuntime().exec("adb devices");
			BufferedReader input = new BufferedReader(new InputStreamReader(pc.getInputStream()));
			DSN = input.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(DSN);
		return DSN;
	}

	public static String getModel() {
		System.out.println(DSN);
		try {
			Process pc = Runtime.getRuntime().exec("adb -s RZ8M31M9CDE shell getprop ro.product.model");
			BufferedReader input = new BufferedReader(new InputStreamReader(pc.getInputStream()));
			Model = input.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Model);
		return Model;
	}

	public static void main(String[] args) {
		getDSN();
		getModel();
	}

}
