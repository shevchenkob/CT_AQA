package com.customertimes.Lesson4;

public abstract class Personal {
    protected long id;
    public int dateOfBirth;
    public String name;

    Personal(long id, int dateOfBirth, String name) {
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.name = name;

    }

    public abstract void work();

    public static void realNotAbstractWork(String... args) {
        System.out.println("I am not abstract method!");
    }
}
