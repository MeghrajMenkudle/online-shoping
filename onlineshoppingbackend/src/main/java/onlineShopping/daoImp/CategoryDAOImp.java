package onlineShopping.daoImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import onlineShopping.dao.CategoryDAO;
import onlineShopping.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImp implements CategoryDAO {
	
	public static List<Category> categories = new ArrayList<Category>();
	
	static{
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setImageURL("televsionImg");
		category.setDiscription("This is description for televsion");
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("mobile");
		category.setImageURL("mobileImg");
		category.setDiscription("This is description for mobile");
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("laptop");
		category.setImageURL("laptopImg");
		category.setDiscription("This is description for laptop");
		categories.add(category);
	}
	
	@Override
	public List<Category> list() {
		return categories;
	}

	@Override
	public Category get(int id) {
		
		for(Category category : categories){
			
			if(category.getId() == id)
				return category;
		}
		
		return null;
	}

}
