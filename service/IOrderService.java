package com.capgemini.bookStore.service;

import com.capgemini.bookStore.beans.Customer;

public interface IOrderService {
	public Customer addressChange();
	public boolean submit();
}
