package com.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class AnimalTest {
    Animal animal = new Animal();

    @Test
    public void getFoodHerbivoreReturnsCorrectList() throws Exception {
        Assert.assertEquals(List.of("Трава", "Различные растения"), animal.getFood("Травоядное"));
    }

    @Test
    public void getFamilyReturnsCorrectString() {
        Assert.assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }

    @Test(expected = Exception.class)
    public void getFoodUnknownKindThrowsException() throws Exception {
        animal.getFood("Всеядное");
    }
}