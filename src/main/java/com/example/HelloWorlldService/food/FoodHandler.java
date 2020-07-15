package com.example.HelloWorlldService.food;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class FoodHandler {

    List<food> foodList = new ArrayList<>(4);

    {
        foodList.add(new food(1, "dal", "very tasty"));
        foodList.add(new food(2, "rice", "dal rice is fun"));
    }

    public food foodById(int id) {
        food tempFood = new food();
        for (food f : foodList) {
            if (f.getFoodId() == id) {
                tempFood = f;
            }
        }
        return tempFood;
    }

    public List<food> allFood() {
        return foodList;
    }
}
