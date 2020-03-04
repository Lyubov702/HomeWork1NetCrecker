package com.myExample.task1;

public class Author {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGander() {
        return gander;
    }

    public void setGander(char gander) {
        this.gander = gander;
    }

    private String name;
    private String email;
    private char gander;

    public Author(String name, String email, char gander) {
        this.name = name;
        this.email = email;
        this.gander = gander;
    }
}
