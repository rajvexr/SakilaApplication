package com.Sakila.api.SakilaApp;

import javax.persistence.*;


@Entity
@Table(name = "actor")
public class Actor {
    ////////////attributes
    @Id
    @Column(name = "actor_id")
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    int actor_id;
    @Column(name = "first_name")
    String actorFirstName;
    @Column(name = "last_name")
    String actorLastName;

    ////constructor

    public Actor(String actorFirstName, String actorLastName){
        this.actorFirstName = actorFirstName;
        this.actorLastName = actorLastName;
    }
    public Actor(){}

    /////method

    public int getActor_id() {
        return actor_id;
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
    }

    public String getActorFirstName() {
        return actorFirstName;
    }

    public void setActorFirstName(String actorFirstName) {
        this.actorFirstName = actorFirstName;
    }

    public String getActorLastName() {
        return actorLastName;
    }

    public void setActorLastName(String actorLastName) {
        this.actorLastName = actorLastName;
    }
}
