package com.weshop.WebschopIAC.repositories;

import com.weshop.WebschopIAC.domain.Discount;
import org.springframework.data.repository.CrudRepository;

public interface DiscountRepo extends CrudRepository<Discount, Long> {
}
