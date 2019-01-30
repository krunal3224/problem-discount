package com.flightnetworks.discount.adapters;
import java.math.BigDecimal;

public interface DiscountAdapter {
	
	final BigDecimal slab0 = BigDecimal.ZERO;
	final BigDecimal slab500 = new BigDecimal(500);
	final BigDecimal slab1000 = new BigDecimal(1000);
	final BigDecimal slab3000 = new BigDecimal(3000);
	final BigDecimal slab5000 = new BigDecimal(5000);
	
	BigDecimal calculateDiscount(BigDecimal amount);
}
