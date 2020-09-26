package com.riotgames.account.model.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class DefineAccountDTO implements Serializable {
	 
	private static final long serialVersionUID = -966144775845740508L;

	private String username;
	private String playerName;
}
