package com.example;

import java.util.List;

public interface Predator {
    int getKittens();
    List<String> getFood(String animalKind) throws Exception;
    List<String> eatMeat() throws Exception;
}
