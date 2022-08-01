package com.example.demo.model;

import java.util.ArrayList;

import java.util.List;

public class TodayOrder {
    private int today = 1;
    private int todayTotalPrice;
    private List<Order> orders;

    public int getToday() {
        return today;
    }

    public void setOrders(List<Order> orders) {
        this.orders=orders;
    }

    public int getTodayTotalPrice() {
        todayTotalPrice = 0;
        for(Order order:orders)
            todayTotalPrice+=order.getTotalPrice();
        return todayTotalPrice;
    }

    public void setTodayTotalPrice(int todayTotalPrice) {

        this.todayTotalPrice = todayTotalPrice;
    }

    public List<Order> getOrders() {

        return orders;
    }
}
