package com.lti.fg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
    @NamedQuery(name = "getCartByUserId", query = "From Cart where userId = :id")
})

@Entity
@Table(name = "ADDTOCART")
public class Cart {

		@Id
	    @Column(name = "CARTID")
	    private int cartId;
	    @Column(name = "USERID")
	    private int userId;
	    @Column(name = "PRODUCTID")
	    private int productId;
	    @Column(name = "QUANTITY")
	    private int quantity;

	    public Cart() {}

	    public Cart(int userId, int productId, int quantity) {
	        this.userId = userId;
	        this.productId = productId;
	        this.quantity = quantity;
	    }

	    public int getCartId() {
	        return cartId;
	    }

	    public void setCartId(int cartId) {
	        this.cartId = cartId;
	    }

	    public int getUserId() {
	        return userId;
	    }

	    public void setUserId(int userId) {
	        this.userId = userId;
	    }

	    public int getProductId() {
	        return productId;
	    }

	    public void setProductId(int productId) {
	        this.productId = productId;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }

	    @Override
	    public String toString() {
	        return "Cart{" +
	                "cartId=" + cartId +
	                ", userId=" + userId +
	                ", productId=" + productId +
	                ", quantity=" + quantity +
	                '}';
	    }
	
}
