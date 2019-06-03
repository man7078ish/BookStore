package com.capgemini.bookStore.service;

import java.util.List;

import com.capgemini.bookStore.beans.Books;
import com.capgemini.bookStore.beans.Order;
import com.capgemini.bookStore.beans.OrderItem;

public interface IOrderHistoryService {
	public List<OrderItem> allOrders(String customerId);
	public Books orderDetail(String bookId);
	

}
