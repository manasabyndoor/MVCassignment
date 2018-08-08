package com.book.pojo;

public class Book {
	private String bookName;
	private int bookPrice;
	private String author;
	private int id;
	public Book()
	{
		
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Book(String bookName, int bookPrice, String author, int id) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.author = author;
		this.id = id;
	}
	

}
