package com.flightnetworks.discount.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.flightnetworks.discount.dtos.DiscountInputDTO;
import com.flightnetworks.discount.dtos.DiscountOutputDTO;
import com.flightnetworks.discount.services.DiscountService;

@Controller
@RequestMapping(value = "/api")
public class DiscountController {
	
	@Autowired
	private DiscountService discountService;
	
	@RequestMapping(value = "/discount", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ResponseEntity<DiscountOutputDTO> calculateDiscount(@ModelAttribute @Valid DiscountInputDTO inputDTO) throws Exception {
		return new ResponseEntity<DiscountOutputDTO>(discountService.calculateDiscount(inputDTO),HttpStatus.OK);
	}

}
