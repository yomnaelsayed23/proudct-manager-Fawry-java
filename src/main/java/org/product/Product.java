package org.product;

import java.util.ArrayList;
import java.util.List;



public class Product {

    int productId =0;
    String productName ;
    int productQuantity;
    Double productPrice;

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public  Product(String productName , Double productPrice, int productId, int productQuantity){
        this.productName = productName;
        this.productPrice = productPrice;
        this.productId = productId;
        this.productQuantity=productQuantity;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }




    public Double getProductPrice() {
        return productPrice;
    }
    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productQuantity='" + productQuantity + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}

