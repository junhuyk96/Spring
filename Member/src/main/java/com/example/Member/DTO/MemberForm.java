package com.example.Member.DTO;

public class MemberForm {
    private String name;
    private String ID;

    public MemberForm(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "NAME = " + name + " ID = " + "ID";
    }
}
