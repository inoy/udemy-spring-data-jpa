package com.bharath.springdata.product.entities;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String name;
	@Column(name = "description")
	private String desc;
	private Double price;
}
