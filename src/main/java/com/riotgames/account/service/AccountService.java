package com.riotgames.account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riotgames.account.model.Account;
import com.riotgames.account.model.dto.CreateAccountDTO;
import com.riotgames.account.model.dto.DefinePlayerNameAccountDTO;
import com.riotgames.account.model.dto.LoginAccountDTO;
import com.riotgames.account.model.dto.RedefinePasswordDTO;
import com.riotgames.account.model.dto.RedefineRegionDTO;
import com.riotgames.account.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	AccountRepository repository;

	public Account createAccount(CreateAccountDTO dto) {
		Account account = new Account();
		account.setEmail(dto.getEmail());
		account.setDateBirth(dto.getDateBirth());
		account.setPassword(dto.getPassword());
		account.setUsername(dto.getUsername());
		account.setIsAdEmail(dto.getIsAdEmail());
		account.setIsTerms(dto.getIsTerms());
		account.setRegion(dto.getRegion());
		return repository.save(account);
	}
	
	public Account loginAccount(LoginAccountDTO loginAccountDTO) {

		Account account = new Account();
		account.setUsername(loginAccountDTO.getUsername());
		account.setPassword(loginAccountDTO.getPassword());

		Account findByUsername = repository.findByUsername(account.getUsername());
		if (findByUsername != null) {
			if (account.getUsername().equals(findByUsername.getUsername())
					&& account.getPassword().equals(findByUsername.getPassword())) {
				return account;

			}
		}
		return null;

	}

	public Account definePlayerNameAccount(DefinePlayerNameAccountDTO definePlayerNameAccountDTO) {
		Account account = new Account();
		account.setUsername(definePlayerNameAccountDTO.getUsername());

		Account accountUpdate = repository.findByUsername(account.getUsername());
		if (accountUpdate != null) {
			accountUpdate.setPlayerName(definePlayerNameAccountDTO.getPlayerName());
			return repository.save(accountUpdate);
		}
		return null;

	}

	public Account redefinePassword(RedefinePasswordDTO redefinePasswordDTO) {
		Account account = new Account();
		account.setUsername(redefinePasswordDTO.getUsername());
		account.setEmail(redefinePasswordDTO.getEmail());
		account.setDateBirth(redefinePasswordDTO.getDateBirth());
		
		Account accountUpdate = repository.findByUsername(account.getUsername());
		
		if (accountUpdate != null) {
			if (accountUpdate.getEmail().equalsIgnoreCase(account.getEmail()) && accountUpdate.getDateBirth().equals(account.getDateBirth())) {
				//Manda email com codigo
				accountUpdate.setPassword(redefinePasswordDTO.getPassword());
				return repository.save(accountUpdate);
			}
			
		}
		return null;
	}
	public Account redefineRegion(RedefineRegionDTO redefineRegionDTO) {
		Account account = new Account();
		account.setUsername(redefineRegionDTO.getUsername());
		
		//Disponiveis apenas essas regiôes: BRAZIL, OCEANIA, EU, NA, LA, TURKEY, ASIA
		
		Account accountUpdate = repository.findByUsername(account.getUsername());
		if (accountUpdate != null) {
			accountUpdate.setRegion(redefineRegionDTO.getRegion());
			return repository.save(accountUpdate);
		}
		return null;

	}
}