package com.flightnetworks.discount.adapters;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component("PremiumUserDiscountAdapter")
public class PremiumUserDiscountAdapter implements DiscountAdapter {

	/***
	 * Slabs for Premium user 0 - 500 No discount Slab1 500 - 1000 -> 10% Slab2 1000
	 * - 3000 -> 15% Slab3 3000 - 5000 -> 20% Slab4 5000 onward -> 25%
	 */
	@Override
	public BigDecimal calculateDiscount(BigDecimal amount) {
		BigDecimal discount = BigDecimal.ZERO;
		if (amount.compareTo(slab500) >= 0) {
			discount = discount.add(new BigDecimal((slab500.doubleValue() * 10) / 100));
		}
		if (amount.compareTo(slab1000) >= 0) {
			discount = discount.add(new BigDecimal((amount.subtract(slab1000.add(slab500)).doubleValue() * 15) / 100));
		}
		if (amount.compareTo(slab3000) >= 0) {
			discount = discount.add(new BigDecimal((amount.subtract(slab3000).doubleValue() * 20) / 100));
		}
		if (amount.compareTo(slab5000) >= 0) {
			discount.add(new BigDecimal((amount.subtract(slab5000).doubleValue() * 25) / 100));
		}
		return discount;
	}

}
