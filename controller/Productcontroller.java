package com.example.demo.controller;
import com.example.demo.model.Product;
import com.example.demo.service.Productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Productcontroller {
    @Autowired
    Productservice ser;
 @GetMapping("/products")
    public List<Product> getProducts() {
     return ser.getProducts();
 }
 @GetMapping("/products/{id}")
    public Product getProductID(@PathVariable int id)
     {
         return ser.getProductId(id);
     }
     @PostMapping("/products")
     public void postProductID(@RequestBody Product pd1)
     {
         System.out.println(pd1);
         ser.postProductID(pd1);
     }
     @PutMapping("/products")
     public void updateproduct(@RequestBody Product pd2)
     {
         ser.updateproduct(pd2);
     }@DeleteMapping("/products/{d1}")
     public void deleteproduct(@PathVariable int d1)
     {
         ser.deleteproduct(d1);
     }
    }

