package com.lti.finance.entity;

import javax.persistence.*;

@NamedQueries({
        @NamedQuery(name = "getAllProducts", query="from Products")
})

@Entity
@Table(name = "PRODUCT")
public class Products
{
    @Id
    @Column(name = "PRODUCTID")
    private int productId;
    @Column(name = "PRODUCTNAME")
    private String productName;
    @Column(name = "PRODUCTCOST")
    private double productCost;
    @Column(name = "IMAGELINK")
    private String productImageLink;

    public Products(){}

    public Products(int productId, String productName, double productCost, String productImageLink) {
        this.productId = productId;
        this.productName = productName;
        this.productCost = productCost;
        this.productImageLink = productImageLink;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductCost() {
        return productCost;
    }

    public void setProductCost(double productCost) {
        this.productCost = productCost;
    }

    public String getProductImageLink() {
        return productImageLink;
    }

    public void setProductImageLink(String productImageLink) {
        this.productImageLink = productImageLink;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productCost=" + productCost +
                ", productImageLink='" + productImageLink + '\'' +
                '}';
    }
}
