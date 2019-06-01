package com.capgemini.bookStore.service;

import java.util.List;

import com.capgemini.bookStore.beans.Books;

public interface ICartService {
	public Books addToCart();
	public int quantity();
	public Books remove();
	public List<Books> clear();

}
