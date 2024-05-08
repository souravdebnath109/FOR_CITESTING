package com.example.khajatest508;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainActivityTest {

    @Test
    public  void  xy()
    {
     Circle c=new Circle(5);
     assertEquals(78.5, c.area(),0.1);
    }

}