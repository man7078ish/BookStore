package com.capgemini.bookStore.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Order")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String orderId;
	private Date orderDate;
	private double total;
	private boolean orderStatus;
	@OneToMany(mappedBy="order",cascade=CascadeType.ALL)
	 private List<OrderItem> orderitems = new ArrayList<OrderItem>();
	private String paymentMode;
	//private String customerId;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="customerId")
	private Customer orderCust;

	public Order(String orderId, Date orderDate, double total, boolean orderStatus, List<OrderItem> orderitems,
			String paymentMode,  Customer orderCust) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.total = total;
		this.orderStatus = orderStatus;
		this.orderitems = orderitems;
		this.paymentMode = paymentMode;
		
		this.orderCust = orderCust;
	}

	public List<OrderItem> getOrderitems() {
		return orderitems;
	}

	public void setOrderitems(List<OrderItem> orderitems) {
		this.orderitems = orderitems;
	}

	public Customer getOrderCust() {
		return orderCust;
	}

	public void setOrderCust(Customer orderCust) {
		this.orderCust = orderCust;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(String orderId, Date orderDate, double total, boolean orderStatus, String paymentMode,
			String customerId) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.total = total;
		this.orderStatus = orderStatus;
		this.paymentMode = paymentMode;
		
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public boolean isOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(boolean orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((orderDate == null) ? 0 : orderDate.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result + (orderStatus ? 1231 : 1237);
		result = prime * result + ((paymentMode == null) ? 0 : paymentMode.hashCode());
		long temp;
		temp = Double.doubleToLongBits(total);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Order other = (Order) obj;
		
		if (orderDate == null) {
			if (other.orderDate != null)
				return false;
		} else if (!orderDate.equals(other.orderDate))
			return false;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		if (orderStatus != other.orderStatus)
			return false;
		if (paymentMode == null) {
			if (other.paymentMode != null)
				return false;
		} else if (!paymentMode.equals(other.paymentMode))
			return false;
		if (Double.doubleToLongBits(total) != Double.doubleToLongBits(other.total))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", total=" + total + ", orderStatus="
				+ orderStatus + ", orderitems=" + orderitems + ", paymentMode=" + paymentMode + ", orderCust=" + orderCust + "]";
	}
	
}