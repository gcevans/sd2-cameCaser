package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class CamelCaserTest {

    @Test
    public void exampleCamelCase() {
        assertEquals("thisIsMyString",CamelCaser.camelCase("this is my string"));
    }

    @Test
    public void shortTestCamelCase() {
        assertEquals("myTest",CamelCaser.camelCase("my test"));
    }

}