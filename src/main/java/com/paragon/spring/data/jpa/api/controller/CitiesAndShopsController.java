package com.paragon.spring.data.jpa.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.paragon.spring.data.jpa.api.dao.Cities;
import com.paragon.spring.data.jpa.api.dao.UserDao;
import com.paragon.spring.data.jpa.api.model.CitiesAndShops;
import com.paragon.spring.data.jpa.api.model.User;
import com.paragon.spring.data.jpa.api.service.UserService;

@RestController
@RequestMapping("/spring-data-jpa")
public class CitiesAndShopsController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/getCitiesAndShps")
	public List<Cities> getAllCities()
	{
		return userService.getCitiesAndShps();
	}
	
	@PostMapping("/getCitiesAndShpsByName")
	public List<Cities> getCitiesAndShpsByName(@RequestBody CitiesAndShops citiesAndShps)
	{
	
		return userService.getCitiesAndShopsByName(citiesAndShps.getCity());
	}
	
	@PostMapping("/saveCityAndShop")
	public Cities saveCityAndShpDetails(@RequestBody CitiesAndShops ciShops)
	{
		return userService.saveCityAndShop(ciShops);
	}
	
	@PostMapping("/findByShop_id")
	public List<Cities> findByShop_id(@RequestBody CitiesAndShops citiesAndShps)
	{
	
		return userService.findByShpId(citiesAndShps.getShp_id());
	}
	
	@PostMapping("/updateShopAndCity")
	public String updateShopAndCity(@RequestBody CitiesAndShops citiesAndShps)
	{
	
		 userService.updateCityAndShop(citiesAndShps);
		 return "Sucessfully updated shop :- "+citiesAndShps.getShop_name();
	}
	
	/* @LoggerPargon */
	/*
	 * @GetMapping("/getUsers") public List<UserDao> getAllUsers() { return
	 * userService.getUsers(); }
	 */
	
	
	/*
	 * @GetMapping("/findByProfession/{profession}") public List<UserDao>
	 * findByProfession(@PathVariable String profession) { return
	 * userService.getUsersByProfession(profession); }
	 * 
	 * @GetMapping("/getByAge/{age}") public String countByAge(@PathVariable int
	 * age) { long count= userService.getCountByAge(age); return
	 * "Total count of users of age greater than "+age +" is :-->"+count; }
	 * 
	 * @GetMapping("/getTotalUsers") public String countOfUsers() { long count=
	 * userService.getCountOfAllUsers(); return "Total count of users is ->"+count;
	 * }
	 * 
	 * @GetMapping("/getByCustomQuery") public List<UserDao> getByCustomQuery() {
	 * return userService.findByCustomQuery(); }
	 * 
	 * 
	 * @PostMapping("/saveUser") public UserDao saveUser(@RequestBody User user) {
	 * System.out.print("gggg"); return userService.saveUser(user); }
	 */
}
