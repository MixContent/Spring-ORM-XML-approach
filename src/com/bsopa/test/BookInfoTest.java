package com.bsopa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bsopa.pojo.BookInfo;
import com.bsopa.service.BookService;

public class BookInfoTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/config/application-context.xml");

		BookInfo book = new BookInfo();
		book.setBookName("CoreJava");
		book.setPublisherName("DS-PUBLISHER");
		book.setPrice(300);

		BookService bookService = (BookService) context.getBean("bookService");
		bookService.saveBook(book);
	}
}
