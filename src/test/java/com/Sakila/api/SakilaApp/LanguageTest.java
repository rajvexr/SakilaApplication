package com.Sakila.api.SakilaApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LanguageTest {

    @Test
    void getLanguageId(){
        Language language = new Language();
        assertEquals(0, language.getLanguage_id(), "that's not the correct id of the language");
    }

    @Test
    void getLanguageName(){
        Language language = new Language("Spanish");
        assertEquals("Spanish", language.getLanguage_name(), "that's not the correct language of the language");
    }


}
