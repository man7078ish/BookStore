package com.capgemini.bookStore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.bookStore.beans.Books;
import com.capgemini.bookStore.beans.Review;
import com.capgemini.bookStore.dao.IBookDetailDao;

public class BookDetailsImpl implements IBookDetailsService{
	@Autowired
	IBookDetailDao Detail;
	


	@Override
	public List<Review> reviews(String bookId) {
		Books book=Detail.getOne(bookId);
		List<Review> bookreview=book.getReviews();
		return bookreview;
	}

	@Override
	public Books details(String bookId) {
		Books book=Detail.getOne(bookId);
		return book;
	}

}
