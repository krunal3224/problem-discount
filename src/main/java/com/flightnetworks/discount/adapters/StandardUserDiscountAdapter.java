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
		BigDecimal discount = BigDecimal.ZERO;
		if (amount.compareTo(slab1000) >= 0) {
			discount = discount.add(new BigDecimal((amount.subtract(slab1000).doubleValue() * 10) / 100));
		}
		if (amount.compareTo(slab3000) >= 0) {
			discount = discount.add(new BigDecimal((amount.subtract(slab3000).doubleValue() * 15) / 100));
		}
		if (amount.compareTo(slab5000) >= 0) {
			discount.add(new BigDecimal((amount.subtract(slab5000).doubleValue() * 20) / 100));
		}
		return discount;
	}

}
