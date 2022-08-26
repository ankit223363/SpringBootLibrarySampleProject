package com.sopra;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//This is pojo class

@Entity
@Table(name="Library")
public class Library {
	@Id
	
	private int id;
	private String name;
	private String author;
	private String Status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Library(int id, String name, String author, String status) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		Status = status;
	}
	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + ", author=" + author + ", Status=" + Status + "]";
	}
	
	
	
	
}
