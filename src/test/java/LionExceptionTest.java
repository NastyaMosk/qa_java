package com.example;

import org.junit.Test;
import org.mockito.Mockito;

public class LionExceptionTest {
    @Test(expected = Exception.class)
    public void shouldThrowExceptionForInvalidSex() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        new Lion("Другой", feline);
    }
}