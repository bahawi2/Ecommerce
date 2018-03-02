package org.bahawi.Ecommercebackend.dao;

import java.util.List;

import org.bahawi.Ecommercebackend.dto.Category;

public interface CategoryDAO {
		List<Category> list();
		Category get(int id);

}
