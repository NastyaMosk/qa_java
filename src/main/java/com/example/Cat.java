package com.example;

import java.util.List;

public class Cat {

    // Используем интерфейс Predator
    private Predator predator;

    // В конструкторе лучше принимать Predator, так код будет универсальнее
    public Cat(Predator predator) {
        this.predator = predator;
    }

    public String getSound() {
        return "Мяу";
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }
}