package com.paragon.spring.data.jpa.api.dao;

import java.sql.Timestamp;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name = "Bills")
public class Bills {

	@Id
	@GeneratedValue
	@Column(name = "id")
	public Integer id;
	@Column(name = "shp_id")
	public String shp_id;
	@Column(name = "name")
	public String name;
	@Column(name = "shop_name")
	public String shp_name;
	@Column(name = "city")
	public String city;
	@Column(name = "bill_date")
	public Date bill_date;
	@Column(name = "bill_type")
	public String bill_type;
	@Column(name = "bill_amount")
	public Integer bill_amount;
	@Column(name = "deposit")
	public Integer deposit;
	@Column(name = "balance")
	public Integer balance;
    @Column(name = "date")
    @CreationTimestamp
	public Date inserted_date;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getShp_id() {
		return shp_id;
	}
	public void setShp_id(String shp_id) {
		this.shp_id = shp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShp_name() {
		return shp_name;
	}
	public void setShp_name(String shp_name) {
		this.shp_name = shp_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getBill_date() {
		return bill_date;
	}
	public void setBill_date(Date bill_date) {
		this.bill_date = bill_date;
	}
	public String getBill_type() {
		return bill_type;
	}
	public void setBill_type(String bill_type) {
		this.bill_type = bill_type;
	}
	public Integer getBill_amount() {
		return bill_amount;
	}
	public void setBill_amount(Integer bill_amount) {
		this.bill_amount = bill_amount;
	}
	public Integer getDeposit() {
		return deposit;
	}
	public void setDeposit(Integer deposit) {
		this.deposit = deposit;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	public Date getInserted_date() {
		return inserted_date;
	}
	public void setInserted_date(Date inserted_date) {
		this.inserted_date = inserted_date;
	}

	
	
	
	
	
	
}
