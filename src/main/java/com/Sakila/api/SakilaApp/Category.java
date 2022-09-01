package com.Sakila.api.SakilaApp;


import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {

    ///Attributes
    @Id
    @Column(name = "category_id")
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    int category_id;
    @Column(name = "name")
    String category_name;

    ///Constructor

    public Category(String category_name){
        this.category_name = category_name;
    }

    public Category(){}

    ///method

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }
}
