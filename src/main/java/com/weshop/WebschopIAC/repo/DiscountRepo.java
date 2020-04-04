package com.weshop.WebschopIAC.repo;

import com.weshop.WebschopIAC.model.Discount;
import org.springframework.data.repository.CrudRepository;

public interface DiscountRepo extends CrudRepository<Discount, Long> {
}
