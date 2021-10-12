package com.harmon.beans;

public class VehicleFactory {

	public static IVehicle getVehicleInstance(String cls) {
		IVehicle obj=null;
		try {
			obj= (IVehicle)Class.forName(cls).newInstance();// load the class programatically
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return obj;
	}
}
