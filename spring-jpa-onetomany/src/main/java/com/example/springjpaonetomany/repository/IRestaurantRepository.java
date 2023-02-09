package com.example.springjpaonetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springjpaonetomany.model.Restaurant;

@Repository
public interface IRestaurantRepository extends JpaRepository<Restaurant, Integer> {

}
