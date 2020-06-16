package com.paragon.spring.data.jpa.api.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paragon.spring.data.jpa.api.dao.Cities;
import com.paragon.spring.data.jpa.api.dao.CitiesAndShopsRepository;
import com.paragon.spring.data.jpa.api.model.CitiesAndShops;

@Service
public class UserService {

	@Autowired
	private CitiesAndShopsRepository userRepository;

	public List<Cities> getCitiesAndShps() {
		return userRepository.findAll();
	}

	public List<Cities> getCitiesAndShopsByName(String name) {
		return userRepository.findByCity(name);
	}

	public Cities saveCityAndShop(CitiesAndShops cityAndShop) {
		Cities city = new Cities();
		city.setOwner_name(cityAndShop.getOwner_name());
		city.setId(cityAndShop.getId());
		city.setCity(cityAndShop.getCity());
		city.setShop_name(cityAndShop.getShop_name());
		city.setShp_id(cityAndShop.getShp_id());
		return userRepository.save(city);
	}

	public List<Cities> findByShpId(String shp_id) {
		return userRepository.findById(shp_id);
	}

	
	  public void updateCityAndShop(CitiesAndShops cityAndShop) {
		Cities city=userRepository.findByShpId(cityAndShop.getShp_id());
	  city.setOwner_name(cityAndShop.getOwner_name());
	  city.setCity(cityAndShop.getCity());
	  city.setShop_name(cityAndShop.getShop_name());
	  city.setShp_id(cityAndShop.getShp_id()); 
	  userRepository.updateCityAndShop(city.getShp_id(), city.getShop_name(), city.getOwner_name(), city.getCity(), city.getId());
	  
	  }
	 

	/*
	 * public UserDao mapping(User user) { UserDao userDao=new UserDao();
	 * userDao.setAge(user.getAge()); return userDao; }
	 * 
	 * @PostConstruct public void initDB() { List<UserDao>usersList=new
	 * ArrayList<>(); usersList.add(new UserDao(111,"Mahesh","IT",23));
	 * usersList.add(new UserDao(222,"Taswar","EEE",24)); usersList.add(new
	 * UserDao(333,"Macha","CSE",23)); usersList.add(new
	 * UserDao(444,"Mams","EEE",24)); usersList.add(new
	 * UserDao(555,"Lappe","ECE",25)); //userRepository.saveAll(usersList); }
	 */
	/*
	 * public List<UserDao> getUsers() {
	 * 
	 * return (List<UserDao>) userRepository.findAll(); }
	 * 
	 * public List<UserDao> getUsersByProfession(String profession) { return
	 * userRepository.findByProfession(profession); }
	 * 
	 * public List<Cities> getUsers() {
	 * 
	 * return (List<UserDao>) userRepository.findAll(); }
	 * 
	 * 
	 * public long getCountByAge(int age) { return userRepository.countByAge(age); }
	 */

	/*
	 * public List<UserDao> findByCustomQuery() { return
	 * userRepository.findByCustomQuery(); }
	 */
	/*
	 * public UserDao saveUser(User user) { System.out.println("Service layer");
	 * UserDao u=this.mapping(user); return userRepository.save(u); }
	 * 
	 * public long getCountOfAllUsers() { return userRepository.count(); }
	 */
}
