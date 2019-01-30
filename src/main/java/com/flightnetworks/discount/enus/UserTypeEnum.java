package com.flightnetworks.discount.enus;

public enum UserTypeEnum {

	Standard("Standard User", "StandardUserDiscountAdapter"), Premium("Premium user", "PremiumUserDiscountAdapter");

	private String displayName;

	private String adapterName;

	private UserTypeEnum(String displayName, String adapterName) {
		this.displayName = displayName;
		this.adapterName = adapterName;
	}

	public String getDisplayName() {
		return displayName;
	}

	public String getAdapterName() {
		return adapterName;
	}
}
