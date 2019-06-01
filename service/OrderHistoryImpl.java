package com.capgemini.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.bookStore.beans.Order;
import com.capgemini.bookStore.dao.IOrderHistoryDao;

public class OrderHistoryImpl implements IOrderHistoryService{
	@Autowired
	
	IOrderHistoryDao History;
	@Override
	public List<Order> allOrders(String customerId) {
		return null;
		
	}

	@Override
	public Order orderDetail() {
		// TODO Auto-generated method stub
		return null;
	}

}
