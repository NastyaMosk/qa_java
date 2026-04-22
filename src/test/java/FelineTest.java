package com.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void eatMeatReturnsCorrectList() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, feline.eatMeat());
    }

    @Test
    public void getFamilyReturnsCats() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensReturnsDefaultOne() {
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensReturnsValidCount() {
        Assert.assertEquals(3, feline.getKittens(3));
    }
}