package com.example.demo.controller;


import com.example.demo.model.Meal;
import com.example.demo.model.Order;
import com.example.demo.model.TodayOrder;
import com.example.demo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@org.springframework.stereotype.Controller

public class Controller {

    @Autowired
    Service service;

    @GetMapping("/order/{seq}")
    public String getOrderBySeq(@PathVariable int seq, Model model){
        Order order = this.service.getOrderBySeq(seq);
        model.addAttribute("order",order);
        return "order";
    }
    @GetMapping("/meal")
    public String getOrderByBurgerName(@RequestParam String name, Model model){
        Meal meal = this.service.getOrderByBurgerName(name);
        model.addAttribute("meal",meal);
        return "meal";
    }
    @GetMapping("/today/{today}")
    public String getToday(@PathVariable int today, Model model){
        TodayOrder todayOrder = this.service.getToday(today);
        model.addAttribute("today",todayOrder);
        return "today";
    }

}
