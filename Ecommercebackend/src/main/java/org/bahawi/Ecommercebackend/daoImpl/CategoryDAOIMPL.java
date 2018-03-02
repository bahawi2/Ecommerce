package org.bahawi.Ecommercebackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.bahawi.Ecommercebackend.dao.CategoryDAO;
import org.bahawi.Ecommercebackend.dto.Category;
import org.springframework.stereotype.Repository;

@Repository("CategoryDAO")
public class CategoryDAOIMPL implements CategoryDAO {
	static List<Category> list=new ArrayList<Category>();
	static {
		list.add(new Category(1, "LAPTOP", "first category", "cat01", true));
		list.add(new Category(2, "TELEVISION", "second category", "cat01", true));
		list.add(new Category(3, "CAMERA", "thirth category", "cat01", true));
	}
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		for(Category category:list)
			if(category.getId()==id)
				return category;
		return null;
	}

}
