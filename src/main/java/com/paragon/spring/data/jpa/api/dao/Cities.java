package com.paragon.spring.data.jpa.api.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CITY_MASTER")
public class Cities {
	  @Id
	    @GeneratedValue
	@Column(name = "id")
	public int id;
	@Column(name = "shp_id")
	public String shp_id;
	@Column(name = "shop_name")
	public String shop_name;
	@Column(name = "owner_name")
	public String owner_name;
	@Column(name = "city")
	public String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getShp_id() {
		return shp_id;
	}
	public void setShp_id(String shp_id) {
		this.shp_id = shp_id;
	}
	public String getShop_name() {
		return shop_name;
	}
	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}
	public String getOwner_name() {
		return owner_name;
	}
	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
