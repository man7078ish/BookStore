package com.capgemini.bookStore.service;

import java.util.List;
import java.util.Optional;

import com.capgemini.bookStore.beans.Books;
import com.capgemini.bookStore.beans.Review;

public interface IBookDetailsService {
	public Books details(String bookId);
	public List<Review> reviews(String bookId);

}
