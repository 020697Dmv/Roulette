package com.crud.entity;

import java.util.HashMap;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

/**
 * Entity for roulette class 
 * 	
 * @author Danny Macias Vanegas
 *
 */
@RedisHash("Roulette")
public class Roulette {	
	@Id
	private Long idRoulette;
	private HashMap<Integer, Bet> betList;
	private String condition
	;	
	public Roulette(String condition) {
		this.condition = condition;
	}
	public Roulette() {
		betList = new HashMap<>();
	}
	public Long getIdRoulette() {
		
		return idRoulette;
	}
	public void setIdRoulette(Long idRoulette) {		
		this.idRoulette = idRoulette;
	}
	public HashMap<Integer, Bet> getBetList() {
		
		return betList;
	}
	public void setBetList(HashMap<Integer, Bet> betList) {
		this.betList = betList;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public void addBetToList(Bet bet) {
		int key = betList.size();
		betList.put(key, bet);
	}
}

