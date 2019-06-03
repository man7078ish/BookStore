package com.capgemini.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.bookStore.beans.Books;
import com.capgemini.bookStore.beans.Order;
import com.capgemini.bookStore.beans.OrderItem;
import com.capgemini.bookStore.dao.IBookDetailDao;
import com.capgemini.bookStore.dao.IOrderHistoryDao;

public class OrderHistoryImpl implements IOrderHistoryService{
	@Autowired
	
	IOrderHistoryDao History;
	@Autowired
	IBookDetailDao detail;
	@Override
	public List<OrderItem> allOrders(String customerId) {
		Order o1=History.getOne(customerId);
		return o1.getOrderitems();
	}

	@Override
	public Books orderDetail(String bookId) {
		Books book=detail.findOne(bookId);
		
		return book;
	}

}
