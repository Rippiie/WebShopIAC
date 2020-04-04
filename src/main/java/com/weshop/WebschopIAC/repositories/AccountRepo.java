package com.weshop.WebschopIAC.repositories;

import com.weshop.WebschopIAC.domain.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepo extends CrudRepository<Account, Long> {
}
