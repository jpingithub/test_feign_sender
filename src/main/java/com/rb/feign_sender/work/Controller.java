package com.rb.feign_sender.work;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/sender")
public class Controller {

    @GetMapping
    public ResponseEntity<Product> getProduct(){
        final Product product = new Product();
        product.setName("iPhone 15 plus");
        product.setCategory("Mobile");
        product.setPrice(65000.00);
        return ResponseEntity.ok(product);
    }
}
