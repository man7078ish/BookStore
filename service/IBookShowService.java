package com.capgemini.bookStore.service;

import java.util.List;

import com.capgemini.bookStore.beans.Books;

public interface IBookShowService {
	public List<Books> categoryWise();
	public List<Books> recent();
	public List<Books> bestSelling();
	public List<Books> mostFavoured();

}
