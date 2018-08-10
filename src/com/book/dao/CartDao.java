package com.book.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.book.pojo.Book;


public class CartDao implements CartDao1{
	Map<String,Book> cartdata= new HashMap<String,Book>();
	BookDao dao=new BookDaoImpl();
	//List<String> cartdata=new ArrayList<String>();
	

	@Override
	public Collection<Book> displaycart() {
	
		return cartdata.values();
	}

	@Override
	public void addtocart(Book book) {
		 
		
	
				cartdata.put(book.getBookName(),book);
	
		
		
		
	}

	
}

