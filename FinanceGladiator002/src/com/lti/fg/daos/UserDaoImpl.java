package com.lti.fg.daos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.fg.entities.Cart;
import com.lti.fg.entities.Product;
import com.lti.fg.entities.User;
import com.lti.fg.exceptions.UsersException;

@Repository
public class UserDaoImpl implements UserDao{
	
	@PersistenceContext
	 private EntityManager manager;
	   
	    @Override
	    public List<User> getAllUsers() throws UsersException
	    {
	        Query query = manager.createQuery("from User");
	        List<User> usersList = query.getResultList();
	        return usersList;
	    }

	    @Override
	    public boolean insertUser(User user) throws UsersException
	    {
	        User existingUser = manager.find(User.class,user.getUserId());
	        if (existingUser==null)
	        {
	            manager.persist(user);
	            return true;
	        }
	        return false;
	    }

	    @Override
	    public List<Product> viewCartDetailsByUserId(int userId) throws UsersException
	    {
	            Query cartQuery = manager.createQuery("From Cart where userId = :id");
	            cartQuery.setParameter("id", userId);
	            List<Cart> cartList = cartQuery.getResultList();
	            List<Product> productsList = new ArrayList<>();
	            for (Cart cart : cartList) {
	                int productId = cart.getProductId();
	                Product product = manager.find(Product.class, productId);
	                productsList.add(product);
	            }
	            
	           return productsList;
	       // }
	        /*catch (CartException e)
	        {
	            System.out.println(e);
	        }
	        return null;*/
	    }

		@Override
		public boolean logIn(User user) throws UsersException {
			
			
			 User existingUser = manager.find(User.class,user.getUserName());
		        if (existingUser.getUserPassword()==user.getUserPassword())
		        {
		            
		            return true;
		        }
			return false;
		}
}
