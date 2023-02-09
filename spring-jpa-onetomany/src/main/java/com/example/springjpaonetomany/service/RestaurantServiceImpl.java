package com.example.springjpaonetomany.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springjpaonetomany.model.Restaurant;
import com.example.springjpaonetomany.repository.IRestaurantRepository;

@Service
public class RestaurantServiceImpl implements IRestaurantService{
	
	
	private IRestaurantRepository restaurantRepository;
	
	@Autowired
	 public void setRestaurantRepository(IRestaurantRepository restaurantRepository) {
		 this.restaurantRepository = restaurantRepository;
	 }

	@Override
	public Restaurant addRestaurant(Restaurant restaurant) {
		return restaurantRepository.save(restaurant);
	}

	@Override
	public void updateRestaurant(Restaurant restaurant) {
		restaurantRepository.save(restaurant);
		
	}

	@Override
	public void deleteRestaurant(int restaurantId) {
	    restaurantRepository.deleteById(restaurantId);
		
	}

	@Override
	public List<Restaurant> getAll() {
		return restaurantRepository.findAll();
	}

	@Override
	public Restaurant getById(int restaurantId) {
		Optional<Restaurant> restOpt = restaurantRepository.findById(restaurantId);
		if(restOpt.isPresent())
			return restOpt.get();
		return null;
	}

	@Override
	public List<Restaurant> getByCity(String city) {
		return null;
	}

	@Override
	public List<Restaurant> getByType(String type) {
		return null;
	}

	@Override
	public List<Restaurant> getByItemNam(String itemName) {
		return null;
	}

	@Override
	public List<Restaurant> getByCuisine(String cuisine) {
		return null;
	}

}
