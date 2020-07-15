package com.example.HelloWorlldService.food;

public class food {
    private int foodId = 0;
    private String foodName;
    private String foodDescription;

    food() {
    }

    public food(int foodId, String foodName, String foodDescription) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodDescription = foodDescription;
    }

    public int getFoodId() {
        return foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }
}
