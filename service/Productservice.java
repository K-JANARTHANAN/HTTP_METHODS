package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class Productservice {
    List<Product> products = new ArrayList<>(Arrays.asList(new Product(1, 43),
            new Product(2, 33),new Product(3,54)));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductId(int id) {
        for (Product i : products) {
            if (i.getId() == id)
                return i;
        }
        return null;
    }

    public  void postProductID(Product pd1) {

        products.add(pd1);
    }
    public  void updateproduct(Product pd2){
        int index=0;
        for (int i=0;i<products.size();i++) {
        if(products.get(i).getId()==pd2.getId()) {
             index=i;
        }
      products.set(index,pd2);
    }
}
public void deleteproduct(int d1) {
    int ind=0;
        for(int i=0;i<products.size();i++) {
            if(products.get(i).getId()==d1)
            {
                ind=i;
            }
        }
        products.remove(ind);

}
}