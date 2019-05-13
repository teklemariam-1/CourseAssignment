package edu.mum.cs.cs425.prodmgmt2.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="products")
public class Product {
  
	@Id
	@GeneratedValue
	private Long pid;
  private Long productNumber;
  private String name;
  private Float unitPrice;
  private LocalDate dateMfd;
public Product(Long pid, Long productNumber, String name, Float unitPrice, LocalDate dateMfd) {
	super();
	this.pid = pid;
	this.productNumber = productNumber;
	this.name = name;
	this.unitPrice = unitPrice;
	this.dateMfd = dateMfd;
}
  
  public Product() {}

public Long getPid() {
	return pid;
}

public void setPid(Long pid) {
	this.pid = pid;
}

public Long getProductNumber() {
	return productNumber;
}

public void setProductNumber(Long productNumber) {
	this.productNumber = productNumber;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Float getUnitPrice() {
	return unitPrice;
}

public void setUnitPrice(Float unitPrice) {
	this.unitPrice = unitPrice;
}

public LocalDate getDateMfd() {
	return dateMfd;
}

public void setDateMfd(LocalDate dateMfd) {
	this.dateMfd = dateMfd;
};
  
}
