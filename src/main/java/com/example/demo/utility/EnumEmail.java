package com.example.demo.utility;

public enum EnumEmail {

	ID("id"), EMAIL_PROVIDER("emailProvider");
	
	private String mapKey;
	
	EnumEmail(String mapKey) {
		this.mapKey = mapKey;
	}

	public String getMapKey() {
		return this.mapKey;
	}
}
