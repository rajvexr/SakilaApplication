package com.Sakila.api.SakilaApp;


import javax.persistence.*;

@Entity
@Table(name = "language")
public class Language {

    ////Attributes
@Id
@Column(name = "language_id")
@GeneratedValue( strategy = GenerationType.IDENTITY)
    int language_id;
    @Column(name = "name")
    String language_name;

    ////Constructor

    public Language(String language_name){
    this.language_name = language_name;
    }

    public Language(){}

    ////Method

    public int getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

    public String getLanguage_name() {
        return language_name;
    }

    public void setLanguage_name(String language_name) {
        this.language_name = language_name;
    }
}
