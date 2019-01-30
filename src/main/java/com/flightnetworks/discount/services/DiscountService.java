package com.flightnetworks.discount.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flightnetworks.discount.adapters.DiscountAdapter;
import com.flightnetworks.discount.dtos.DiscountInputDTO;
import com.flightnetworks.discount.dtos.DiscountOutputDTO;

@Service
@Transactional(rollbackFor = Throwable.class)
public class DiscountService {

	@Autowired
	private ApplicationContext applicationContext;

	public DiscountOutputDTO calculateDiscount(DiscountInputDTO inputDTO) {
		DiscountOutputDTO dto = new DiscountOutputDTO();
		DiscountAdapter adapter = applicationContext.getBean(inputDTO.getUserType().getAdapterName(),
				DiscountAdapter.class);
		dto.setDiscount(adapter.calculateDiscount(inputDTO.getAmount()));
		dto.setPayableAmount(inputDTO.getAmount().subtract(dto.getDiscount()));
		return dto;
	}
}
