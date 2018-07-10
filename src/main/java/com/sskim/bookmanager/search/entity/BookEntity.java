package com.sskim.bookmanager.search.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK_TBL")
public class BookEntity {
	@Id
   @GeneratedValue
   @Column(name = "UID")
	private Long id;
	
	@Column(name = "TITLE")
    private String title;
	
	@Column(name = "AUTHOR")
    private String author;
	
	@Column(name = "PRICE")
    private Double price;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
