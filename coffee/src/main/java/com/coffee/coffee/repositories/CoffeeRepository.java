package com.coffee.coffee.repositories;

import org.springframework.data.repository.CrudRepository;

import com.coffee.coffee.models.Coffee;

public interface CoffeeRepository extends CrudRepository<Coffee, String> {}
