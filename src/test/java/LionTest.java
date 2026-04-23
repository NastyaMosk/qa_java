package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.List;

public class LionTest {

    @Test
    public void getKittensReturnsCorrectValue() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        // Передаем любой корректный пол, так как метод не зависит от него
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFoodReturnsCorrectList() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion("Самка", feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        Assert.assertEquals(expectedFood, lion.getFood());
    }

    @Test(expected = Exception.class)
    public void constructorThrowsExceptionOnInvalidSex() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        new Lion("Некорректный пол", feline);
    }
}