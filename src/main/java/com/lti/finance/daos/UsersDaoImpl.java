package com.lti.finance.daos;

import com.lti.finance.entity.Cart;
import com.lti.finance.entity.Products;
import com.lti.finance.entity.Users;
import com.lti.finance.exception.CartException;
import com.lti.finance.exception.UsersException;
import com.lti.finance.factories.JpaFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class UsersDaoImpl implements UsersDao
{

    private EntityManager manager;
    private EntityManagerFactory factory;

    public UsersDaoImpl()
    {
        factory = JpaFactory.getFactory();
        manager = factory.createEntityManager();
    }

    @Override
    public List<Users> getAllUsers() throws UsersException
    {
        Query query = manager.createNamedQuery("getAllUsers");
        List<Users> usersList = query.getResultList();
        return usersList;
    }

    @Override
    public boolean insertUser(Users user) throws UsersException
    {
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        Users existingUser = manager.find(Users.class,user.getUserId());
        if (existingUser==null)
        {
            manager.persist(user);
            transaction.commit();
            manager.close();
            return true;
        }
        return false;
    }

    @Override
    public List<String> viewCartDetailsByUserId(int userId) throws UsersException
    {
            Query cartQuery = manager.createQuery("From Cart where userId = :id");
            cartQuery.setParameter("id", userId);
            List<Cart> cartList = cartQuery.getResultList();
            List<Products> productsList = new ArrayList<>();
            for (Cart cart : cartList) {
                int productId = cart.getProductId();
                Products product = manager.find(Products.class, productId);
                productsList.add(product);
            }
            List<String> productDescription = new ArrayList<>();
            String prod = "";
            productDescription.add("Product Name" + "   " + "Product Cost");
            double cartCost = 0.0;
            for (Products product : productsList) {
                prod = product.getProductName() + "         " + product.getProductCost();
                productDescription.add(prod);
                cartCost += product.getProductCost();
            }
            productDescription.add("Total Cost = " + cartCost);
            return productDescription;
       // }
        /*catch (CartException e)
        {
            System.out.println(e);
        }
        return null;*/
    }
}
