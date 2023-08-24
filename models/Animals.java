package models;

import java.util.ArrayList;

public abstract class Animals implements Commands{

    public String name;
    public String poroda;
    public int age;
    boolean skill = false;
    public static ArrayList commands;

    public Animals(String name, String poroda, int age) {
       this.name = name;
        this.poroda = poroda;
        this.age = age;
        commands = new ArrayList<>();
        commands.add("голос");
    }
    
    
    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        String result = "кличка - " + this.name + 
        ", порода - " + this.poroda + 
        ", возраст - " + this.age + 
        ", команды - " + this.commands.toString();
        return result;
    }

    
    
}
