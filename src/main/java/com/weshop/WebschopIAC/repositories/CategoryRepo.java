package com.weshop.WebschopIAC.repositories;

import com.weshop.WebschopIAC.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category, Long> {
}
