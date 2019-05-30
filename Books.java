package com.capgemini.bookStore.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Books {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String bookId;
	private String title;
	private String author;
	private String description;
	private long isbnNo;
	private String thumbnail;
	private float price;
	private Date publishDate;
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getIsbnNo() {
		return isbnNo;
	}
	public void setIsbnNo(long isbnNo) {
		this.isbnNo = isbnNo;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	
	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", title=" + title + ", author=" + author + ", description=" + description
				+ ", isbnNo=" + isbnNo + ", thumbnail=" + thumbnail + ", price=" + price + ", publishDate="
				+ publishDate + "]";
	}
	public Books(String bookId, String title, String author, String description, long isbnNo, String thumbnail,
			float price, Date publishDate, String categoryId) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.description = description;
		this.isbnNo = isbnNo;
		this.thumbnail = thumbnail;
		this.price = price;
		this.publishDate = publishDate;
	}
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
