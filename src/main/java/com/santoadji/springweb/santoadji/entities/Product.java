package com.santoadji.springweb.santoadji.entities;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private int price;
    private Integer amount;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getDescription()
    {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {

        this.price = price;
    }
}
