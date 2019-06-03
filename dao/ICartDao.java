package com.capgemini.bookStore.dao;

import java.util.List;

import com.capgemini.bookStore.beans.Books;

public interface ICartDao {
	public Books addToCart();
	public int quantity();
	public Books remove();
	public List<Books> clear();

}
