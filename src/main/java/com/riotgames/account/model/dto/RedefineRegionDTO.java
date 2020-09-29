package com.riotgames.account.model.dto;

import java.io.Serializable;

import com.riotgames.account.service.Region;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class RedefineRegionDTO implements Serializable{
	
	
	private static final long serialVersionUID = 9120878411052664532L;
	private String username;
	private Region region;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
}
