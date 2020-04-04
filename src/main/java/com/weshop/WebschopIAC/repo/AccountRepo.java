package com.weshop.WebschopIAC.repo;

import com.weshop.WebschopIAC.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepo extends CrudRepository<Account, Long> {
}
