package com.paragon.spring.data.jpa.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BillsRepository extends JpaRepository<Bills, Integer>{

	
	public Bills saveAndFlush(Bills bills);
	@Query("select u from Bills u where u.shp_id=:shp_id and u.inserted_date=(select max(inserted_date) from Bills)")
	public Bills getBill(@Param("shp_id") String shp_id);
	@Query("select u from Bills u where u.shp_id=:shp_id ")
	public List<Bills> findAllBills(@Param("shp_id") String shp_id);
}
