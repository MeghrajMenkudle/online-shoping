package onlineShopping.dao;

import java.util.List;

import onlineShopping.dto.Category;

public interface CategoryDAO {
	public List<Category> list();
	Category get(int id);
}
