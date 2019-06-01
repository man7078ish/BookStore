package com.capgemini.bookStore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.bookStore.beans.Books;

public interface IBookDetailDao extends JpaRepository<Books, String>{

}
