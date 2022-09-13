package com.Sakila.api.SakilaApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActorTest {

    @Test
    void getActorId(){
        Actor actor = new Actor("Rajveer", "Singh");
        actor.setActor_id(5);
        assertEquals(5, actor.getActor_id(), "that's not the correct id of the actor");
    }

    @Test
    void getActorFirstName(){
        Actor actor = new Actor();
        actor.setActorFirstName("Rajveer");
        assertEquals("Rajveer", actor.getActorFirstName(), "that's not the correct first name of the actor");
    }

    @Test
    void getActorLastName(){
        Actor actor = new Actor();
        actor.setActorLastName("Singh");
        assertEquals("Singh", actor.getActorLastName(), "that's not the correct last name of the actor");
    }



}
