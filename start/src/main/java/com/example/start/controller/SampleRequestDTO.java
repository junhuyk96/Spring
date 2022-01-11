package com.example.start.controller;

public class SampleRequestDTO {
    private String name;
    private int age;
    private String hobby;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return String.format("name : %s, age : %d, hobby : %s",
                name, age, hobby);
    }
}
