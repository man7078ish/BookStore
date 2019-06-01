package com.capgemini.bookStore.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OrderItem")
public class OrderItem {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	private String book;
	private int quantity;
	private float subTotal;
	public float getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(float subTotal) {
		this.subTotal = subTotal;
	}

	private double price;

	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderItem(String id, String book, int quantity, float subTotal, double price) {
		super();
		this.id = id;
		this.book = book;
		this.quantity = quantity;
		this.subTotal = subTotal;
		this.price = price;
	}

	public OrderItem(String id, String book, int quantity, double price) {
		super();
		this.id = id;
		this.book = book;
		this.quantity = quantity;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((book == null) ? 0 : book.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + quantity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		if (book == null) {
			if (other.book != null)
				return false;
		} else if (!book.equals(other.book))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", book=" + book + ", quantity=" + quantity + ", subTotal=" + subTotal
				+ ", price=" + price + "]";
	}
	
}
	
