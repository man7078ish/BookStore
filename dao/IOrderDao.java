package com.capgemini.bookStore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.bookStore.beans.Order;

public interface IOrderDao extends JpaRepository<Order, String> {

}
