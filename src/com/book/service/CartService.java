package com.book.service;

import java.util.Collection;

import com.book.dao.BookDao;
import com.book.dao.CartDao;
import com.book.dao.CartDao1;
import com.book.pojo.Book;


public class CartService implements CartService1{

	CartDao1 cartdao=new CartDao();
	@Override
	public void addtocart(Book book) {
		// TODO Auto-generated method stub
		cartdao.addtocart(book);
	}

	@Override
	public Collection<Book> displaycart() {
		// TODO Auto-generated method stub
		return cartdao.displaycart();	}
	

}
