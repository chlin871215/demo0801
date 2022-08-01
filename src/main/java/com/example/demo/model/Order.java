package com.example.demo.model;

import java.util.List;

public class Order {

    private int seq ;
    private int totalPrice =0;
    private String waiter;
    private List<Meal> meals;



    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public int getTotalPrice() {
        totalPrice=0;
        for(Meal meal :meals){
            totalPrice+= meal.getPrice();
        }
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getWaiter() {
        return waiter;
    }

    public void setWaiter(String waiter) {
        this.waiter = waiter;
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }
}
