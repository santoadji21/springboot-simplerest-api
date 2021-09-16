package com.santoadji.springweb.santoadji.controllers;

import com.santoadji.springweb.santoadji.entities.Product;
import com.santoadji.springweb.santoadji.repos.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductRestController {

    @Autowired
    ProductRepository repository;

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductRestController.class);

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<Product> getProduct(){
//        System.out.println(repository.findAll());
        return repository.findAll();
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public Product getProduct(@PathVariable("id") int id){
        LOGGER.info("Finding product By Id: " + id);
        return repository.findById(id).get();
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public Product createProduct(@RequestBody Product product){
        return repository.save(product);
    }

    @RequestMapping(value = "/products", method = RequestMethod.PUT)
    public Product updateProduct(@RequestBody Product product){
        return repository.save(product);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
    public void deleteProduct(@PathVariable("id") int id){
        repository.deleteById(id);
    }

}
