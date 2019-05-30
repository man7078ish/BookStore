package com.capgemini.bookStore.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private String bookId;
	private String customerId;
	
	
	
	public Review() {
	}
	
	public Review(String reviewID, int rating, String headLine, String comment, String bookId, String customerId) {
		super();
		this.reviewID = reviewID;
		this.rating = rating;
		this.headLine = headLine;
		this.comment = comment;
		this.bookId = bookId;
		this.customerId = customerId;
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
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookId == null) ? 0 : bookId.hashCode());
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
		result = prime * result + ((headLine == null) ? 0 : headLine.hashCode());
		result = prime * result + rating;
		result = prime * result + ((reviewID == null) ? 0 : reviewID.hashCode());
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
		Review other = (Review) obj;
		if (bookId == null) {
			if (other.bookId != null)
				return false;
		} else if (!bookId.equals(other.bookId))
			return false;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!customerId.equals(other.customerId))
			return false;
		if (headLine == null) {
			if (other.headLine != null)
				return false;
		} else if (!headLine.equals(other.headLine))
			return false;
		if (rating != other.rating)
			return false;
		if (reviewID == null) {
			if (other.reviewID != null)
				return false;
		} else if (!reviewID.equals(other.reviewID))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Review [reviewID=" + reviewID + ", rating=" + rating + ", headLine=" + headLine + ", comment=" + comment
				+ ", bookId=" + bookId + ", customerId=" + customerId + "]";
	}
	
	
	}
