package com.capgemini.bookStore.service;

import java.util.List;

import com.capgemini.bookStore.beans.Order;

public interface IOrderHistoryService {
	public List<Order> allOrders(String customerId);
	public Order orderDetail();
	

}
