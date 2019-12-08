package com.example.demo_spring_01.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class Knight {

    private String name ;
    private int age;
    private Quest quest;

    @Autowired
    public Knight() {
        this.name = "Lancelot";
        this.age = 29;
    }

    public Knight(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setQuest(Quest quest) {
        System.out.println("Ustawiam zadanie dla rycerza");
        this.quest = quest;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Knight: " + name + "[" + age + "] ma zadanie: " + quest;
    }
}
