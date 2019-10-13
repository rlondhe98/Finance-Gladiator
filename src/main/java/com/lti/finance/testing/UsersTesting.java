package com.lti.finance.testing;

import com.lti.finance.entity.Cart;
import com.lti.finance.entity.Products;
import com.lti.finance.entity.Users;
import com.lti.finance.exception.CartException;
import com.lti.finance.exception.ProductException;
import com.lti.finance.exception.UsersException;
import com.lti.finance.services.*;

public class UsersTesting
{
    private static UsersServices usersServices = new UsersServicesImpl();
    private static ProductsServices productsServices = new ProductsServicesImpl();
    private static CartServices cartServices = new CartServicesImpl();
    public static void main(String[] args)
    {
        //insertUser();
        //getAllUsers();
        //insertProduct();
        //getAllProducts();
        //insertIntoCart();
        //printCartDetails();
        printCartDescription();
    }

    private static void insertUser()
    {
        try
        {
            boolean isInserted = usersServices.insertUser(new Users(102, "Rutuja", "pass2", "abc@xuz.com", 9232345L, "mahape", 66775546L, 8876543L));
            if (isInserted)
                System.out.println("User inserted successfully!");
            else
                System.out.println("Error inserting user!");
        }
        catch (UsersException e)
        {
            System.out.println(e);
        }
    }

    private static void getAllUsers()
    {
        try {
            for (Users user : usersServices.getAllUsers())
                System.out.println(user);
        }
        catch (UsersException e)
        {
            System.out.println(e);
        }
    }

    private static void insertProduct()
    {
        try
        {
            boolean isInserted = productsServices.insertNewProduct(new Products(103, "Rebook shoes", 2500.00, "link"));
            if (isInserted)
                System.out.println("Product inserted successfully!");
            else
                System.out.println("Error inserting user!");
        }
        catch (ProductException e)
        {
            System.out.println(e);
        }
    }

    private static void getAllProducts()
    {
        try {
            for (Products product : productsServices.getAllProducts())
                System.out.println(product);
        }
        catch (ProductException e)
        {
            System.out.println(e);
        }
    }

    private static void printCartDetails()
    {
        try {
            System.out.println(cartServices.veiwCart(100));
        }
        catch (CartException e)
        {
            System.out.println(e);
        }
    }

    private static void insertIntoCart()
    {
        try {
            boolean isInserted = cartServices.addToCart(new Cart(2,100,105,1));
            if (isInserted)
                System.out.println("Products added to cart!");
            else
                System.out.println("Error inserting values to cart!");
        }
        catch (CartException e)
        {
            System.out.println(e);
        }
    }

    private static void printCartDescription()
    {
        try
        {
            for (String cartDetails : usersServices.viewCartDetailsByUserId(100))
                System.out.println(cartDetails);
        }
        catch (UsersException e)
        {
            System.out.println(e);
        }
    }
}
