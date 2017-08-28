package com.bsopa.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.bsopa.pojo.BookInfo;

public class BookInfoDaoImpl implements BookInfoDao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void saveBook(BookInfo books) {
		hibernateTemplate.save(books);
	}

}
