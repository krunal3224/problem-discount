package com.flightnetworks.discount.dtos;

import java.math.BigDecimal;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.flightnetworks.discount.enus.UserTypeEnum;

public class DiscountInputDTO {

	private UserTypeEnum userType;

	@NotNull
	@Min(value=0)
	private BigDecimal amount;

	public UserTypeEnum getUserType() {
		return userType;
	}

	public void setUserType(UserTypeEnum userType) {
		this.userType = userType;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
}
