package com.weshop.WebschopIAC.repo;

import com.weshop.WebschopIAC.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category, Long> {
}
