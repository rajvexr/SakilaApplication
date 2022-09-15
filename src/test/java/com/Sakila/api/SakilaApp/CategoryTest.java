package com.Sakila.api.SakilaApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CategoryTest {

    @Test
    void getCategoryId(){
        Category category = new Category();
        category.setCategory_id(3);
        assertEquals(3, category.getCategory_id(), "that's not the correct id of the Category");
    }

    @Test
    void getCategoryName(){
        Category category = new Category();
        category.setCategory_name("Horror");
        assertEquals("Horror", category.getCategory_name(), "that's not the correct name of the Category");
    }

}
