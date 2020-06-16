package com.paragon.spring.data.jpa.api.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;



public class BillsReqModel {

	

	public Integer id;
	public String shp_id;
	public String name;
	public String shp_name;
	public String city;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm")
	public Date bill_date;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm")
	public Date insertedDate;
	public String bill_type;
	public Integer bill_amount;
	public Integer deposit;
	public Integer balance;
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
	public Date getInsertedDate() {
		return insertedDate;
	}
	public void setInsertedDate(Date insertedDate) {
		this.insertedDate = insertedDate;
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
	
	
	
}
