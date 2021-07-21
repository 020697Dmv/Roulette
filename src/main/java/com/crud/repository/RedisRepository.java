package com.crud.repository;

import java.util.Map;

import com.crud.entity.Roulette;


public interface RedisRepository {
	
	Map<String, Roulette> findAll();
	Roulette findById(Long id);
    void save(Roulette roulette);
    void delete(Long id);

}
