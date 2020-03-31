package com.nagarro.od.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.od.entity.OdOrderListRes;
import com.nagarro.od.service.OdOrderService;

@RestController
public class OdOrderController {

	@Autowired
	private OdOrderService odOrderService;
	
	@GetMapping("/orders/{userId}")
	public ResponseEntity<OdOrderListRes> getOrdersByUserId(@PathVariable(required=true) Long userId){
		return ResponseEntity.ok(odOrderService.getOrderDetailByUser(userId));
	}
	
}
