package com.example.springjpaonetomany;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springjpaonetomany.model.Item;
import com.example.springjpaonetomany.model.Restaurant;
import com.example.springjpaonetomany.service.IRestaurantService;

@SpringBootApplication
public class SpringJpaOnetomanyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaOnetomanyApplication.class, args);
	}
	
	@Autowired
	private IRestaurantService restaurantService;
	
	

	@Override
	public void run(String... args) throws Exception {
		
		Item itemOne = new Item("Dosa","Breakfast","SS",100);
		Item itemTwo = new Item("FriedRice","Dinner","SS",200);
		Item itemThree = new Item("Idly","Breakfast","SS",300);
		
		List<Item> itemsList = Arrays.asList(itemOne,itemTwo,itemThree);
		Set<Item> items = new HashSet<>(itemsList);
		Restaurant restaurant = new Restaurant("Taj","non-veg","Bangalore",items);
		
		restaurantService.addRestaurant(restaurant);
	}

}
