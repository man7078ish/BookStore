package com.capgemini.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.bookStore.beans.Books;
import com.capgemini.bookStore.dao.IBookShowDao;

public class BookShowImpl implements IBookShowService{
	@Autowired
	IBookShowDao Show;

	@Override
	public List<Books> categoryWise() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Books> recent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Books> bestSelling() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Books> mostFavoured() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
