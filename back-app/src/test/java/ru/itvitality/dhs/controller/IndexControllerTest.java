package ru.itvitality.dhs.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("IndexController must")
class IndexControllerTest {

    @DisplayName("return index template for empty path")
    @Test
    public void testIndex() {
        IndexController indexController = new IndexController();

        assertEquals( "index", indexController.index() );
    }

}