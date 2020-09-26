package com.riotgames.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riotgames.account.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {

	Account findByUsername(String username);
	

}
