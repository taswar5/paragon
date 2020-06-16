package com.paragon.spring.data.jpa.api.dao;

import java.util.List;

import javax.persistence.Column;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.paragon.spring.data.jpa.api.model.User;

public interface CitiesAndShopsRepository extends JpaRepository<Cities, Integer>{

	//public List<UserDao> findByProfession(String professio);
	//public List<UserDao> findByName(String name);
	//public long countByAge(int age);
	
	/*
	 * @Query("select u from UserDao u where u.id='111'") public List<UserDao>
	 * findByCustomQuery();
	 */
	
	public List<Cities> findAll();
	public List<Cities>findByCity(String city);
	public Cities saveAndFlush(Cities cityAndShop);
	@Query("select u from Cities u where u.shp_id like %:shp_id%")
	public List<Cities> findById(@Param("shp_id") String shp_id);
	 @Transactional
	  @Modifying
	@Query("update Cities u set u.shp_id =:shp_id , u.shop_name=:shop_name,u.owner_name=:owner_name,u.city=:city where u.id=:id")
	public void updateCityAndShop(@Param("shp_id") String shp_id,@Param("shop_name") String shop_name,@Param("owner_name") String owner_name,@Param("city") String city,int id);
	@Query("select u from Cities u where u.shp_id=:shp_id")
	public Cities findByShpId(@Param("shp_id") String shp_id);
}
