package com.example.demo.service;

import com.example.demo.model.Meal;
import com.example.demo.model.Order;
import com.example.demo.model.TodayOrder;

import java.util.List;
import java.util.ArrayList;
@org.springframework.stereotype.Service
public class Service {

    TodayOrder todayOrder = new TodayOrder();
    Order order = new Order();
    Order order2 = new Order();
    List<Meal> orderList;
    List<Order> allOrder;
    public Service() {
        this.allOrder = new ArrayList<Order>();
        this.orderList = new ArrayList<Meal>();
        this.orderList.add(new Meal("hamburger", 100, "this is good"));
        this.orderList.add(new Meal("cheeseburger", 520, "this is very good"));
        order.setMeals(orderList);
        order.setWaiter("andy");
        order.setSeq(1);
        this.allOrder.add(order);

        this.orderList = new ArrayList<Meal>();
        this.orderList.add(new Meal("chickenburger", 1000, "this is good"));
        this.orderList.add(new Meal("beefburger", 500, "this is very good"));
        order2.setMeals(orderList);
        order2.setWaiter("julia");
        order2.setSeq(2);
        this.allOrder.add(order2);
        todayOrder.setOrders(allOrder);


    }

    public Meal getOrderByBurgerName(String name) {
        for(Order order : todayOrder.getOrders()){
            for (int i = 0; i < order.getMeals().size(); i++) {
                if (order.getMeals().get(i).getName().equals(name.toLowerCase())) {
                    return order.getMeals().get(i);
                }
            }
        }

        return null;
    }
    public Order getOrderBySeq(int seq){
        for(Order order : todayOrder.getOrders()) {
            if (order.getSeq() == seq) {
                return order;
            }
        }
        return null;
    }

    public TodayOrder getToday(int today){
        if (todayOrder.getToday()==today){
            return todayOrder;
        }
        return null;
    }

}
