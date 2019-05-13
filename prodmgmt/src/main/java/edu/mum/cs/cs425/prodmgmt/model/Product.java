package edu.mum.cs.cs425.prodmgmt.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Eritrea")
public class Product {
  
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;
  private Long productNumber;
  private String name;
  private Float unitPrice;
  private LocalDate dateMfd;
public Product(int pid, Long productNumber, String name, Float unitPrice, LocalDate dateMfd) {
	super();
	this.pid = pid;
	this.productNumber = productNumber;
	this.name = name;
	this.unitPrice = unitPrice;
	this.dateMfd = dateMfd;
}
  
  public Product() {}

public int getPid() {
	return pid;
}

public void setPid(int pid) {
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
}

@Override
public String toString() {
	return "Product [pid=" + pid + ", productNumber=" + productNumber + ", name=" + name + ", unitPrice=" + unitPrice
			+ ", dateMfd=" + dateMfd + "]";
}
  
}
