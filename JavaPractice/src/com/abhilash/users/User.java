package com.abhilash.users;
import com.abhilash.products.ProductInfo;

public class User {
    public static void main(String args[]) {
        ProductInfo prd0 = new ProductInfo();
        System.out.println(prd0); 
        
        ProductInfo prd1 = new ProductInfo("Macbook", 170000, "M3, Black", 1);
        System.out.println(prd1.productName + " - " + prd1.productDesc);
        
        ProductInfo prd2 = new ProductInfo("Macbook", "M3, Black");
        System.out.println( prd2.productName + prd2.productDesc);
    }
}
