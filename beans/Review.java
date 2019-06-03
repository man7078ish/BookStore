package com.capgemini.bookStore.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Review")
public class Review {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String reviewID;
	private int rating;
	private String headLine;
	private String comment;
	//private String book_Id;
	private String customerId;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="bookId")
	private Books bookReview;
	public Review(String reviewID, int rating, String headLine, String comment, String customerId, Books bookReview) {
		super();
		this.reviewID = reviewID;
		this.rating = rating;
		this.headLine = headLine;
		this.comment = comment;
		this.customerId = customerId;
		this.bookReview = bookReview;
	}
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getReviewID() {
		return reviewID;
	}
	public void setReviewID(String reviewID) {
		this.reviewID = reviewID;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getHeadLine() {
		return headLine;
	}
	public void setHeadLine(String headLine) {
		this.headLine = headLine;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public Books getBookReview() {
		return bookReview;
	}
	public void setBookReview(Books bookReview) {
		this.bookReview = bookReview;
	}
	@Override
	public String toString() {
		return "Review [reviewID=" + reviewID + ", rating=" + rating + ", headLine=" + headLine + ", comment=" + comment
				+ ", customerId=" + customerId + ", bookReview=" + bookReview + "]";
	}
	
	

	
	}
