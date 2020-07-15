package com.example.HelloWorlldService.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
public class FoodController {
    @Autowired
    FoodHandler foodHandler ;

    @RequestMapping(path = "/food/{id}",method = RequestMethod.GET)
    public food getFoodById(@PathVariable int id){
        return foodHandler.foodById(id);
    }

    @GetMapping("/foods")
    public List<food> allFood(){
        return foodHandler.allFood();
    }
}
