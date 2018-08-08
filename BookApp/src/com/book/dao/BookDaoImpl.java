package com.book.dao;

import java.util.HashMap;
import java.util.Map;

import com.book.pojo.Book;

public class BookDaoImpl implements BookDao {
	 
	Map<Integer,String> bookdata= new HashMap<>();
	public void addToCart(Book book) {
		
		bookdata.put(book.getId(), book.getBookName());
		
	}
	public void deleteItems(Book book)
	{
		bookdata.remove(book.getId());
		
	}
	public void display()
	{
		bookdata.values();
		
	}

}
