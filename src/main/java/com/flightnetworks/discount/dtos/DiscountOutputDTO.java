package com.flightnetworks.discount.dtos;

import java.math.BigDecimal;

public class DiscountOutputDTO {

	private BigDecimal discount;
	
	private BigDecimal payableAmount;

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public BigDecimal getPayableAmount() {
		return payableAmount;
	}

	public void setPayableAmount(BigDecimal payableAmount) {
		this.payableAmount = payableAmount;
	}	
}
