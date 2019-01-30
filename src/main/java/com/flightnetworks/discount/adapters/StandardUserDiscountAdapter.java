package com.flightnetworks.discount.adapters;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component("StandardUserDiscountAdapter")
public class StandardUserDiscountAdapter implements DiscountAdapter {

	/***
	 * Slabs for Standard user 0 - 1000 No discount Slab1 1000 - 3000 -> 10% Slab2
	 * 3000 - 5000 -> 15% Slab3 5000 onward -> 20%
	 */
	@Override
	public BigDecimal calculateDiscount(BigDecimal amount) {
		if (amount.compareTo(slab5000) >= 0) {
			return new BigDecimal(20);
		} else if (amount.compareTo(slab3000) >= 0 && amount.compareTo(slab5000) < 0) {
			return new BigDecimal(15);
		} else if (amount.compareTo(slab1000) >= 0 && amount.compareTo(slab3000) < 0) {
			return new BigDecimal(10);
		} else {
			return BigDecimal.ZERO;
		}
	}

}
