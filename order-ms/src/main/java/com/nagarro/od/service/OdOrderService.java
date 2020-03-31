package com.nagarro.od.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nagarro.od.entity.OdOrderListRes;
import com.nagarro.od.entity.OdOrderVO;

@Service
public class OdOrderService {
	
	public OdOrderListRes getOrderDetailByUser(Long userId){
		List<OdOrderVO> orderList = new ArrayList<>();
		OdOrderVO order1 = new OdOrderVO();
		order1.setOrderId(1L);
		order1.setAmount(250);
		order1.setDate("15-Apr-2020");
		orderList.add(order1);
		OdOrderVO order2 = new OdOrderVO();
		order2.setOrderId(2L);
		order2.setAmount(450);
		order2.setDate("16-Apr-2020");
		orderList.add(order2);
		OdOrderListRes orders = new OdOrderListRes();
		orders.setOrders(orderList);
		return orders;
	}
}
