package com.nagarro.uo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nagarro.uo.entity.response.UoUserOrderRes;
import com.nagarro.uo.entity.response.UoUserRes;

@RestController
public class UoUserOrderController {
	
	@Value("${service.user.url}")
	private String userUrl;
	
	@Value("${service.order.url}")
	private String orderUrl;
	
	
	@GetMapping(value = "/orderdetails/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UoUserOrderRes> getUser(@PathVariable Long userId){

		Map<String,Long> uriVariables = new HashMap<>();
		uriVariables.put("userId", userId);	
		ResponseEntity<UoUserRes> userDetails = new RestTemplate().getForEntity(userUrl+"/user/{userId}", 
				UoUserRes.class, uriVariables);
		ResponseEntity<UoUserOrderRes> orders = new RestTemplate().getForEntity(orderUrl+"/orders/{userId}", 
				UoUserOrderRes.class, uriVariables);
		UoUserOrderRes res = new UoUserOrderRes();
		res.setUserDetails(userDetails.getBody());
		res.setOrders(orders.getBody().getOrders());
		return ResponseEntity.ok(res);
	}
}
