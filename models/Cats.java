package models;

import java.util.ArrayList;

public class Cats extends Animals{
    
    private ArrayList commands = new ArrayList<>();
    public Cats(String name, String poroda, int age) {
        super(name, poroda, age);
        this.commands.add(super.commands.get(0));
        this.commands.add("прыгать на стул");
    }

    @Override
    public String getVoice() {
       String result = "Кошка " + this.name + " говорит мяу-мяу!!!";
        return result;
    }

    @Override
    public String toString(){
        String result = "кличка - " + this.name + 
        ", порода - " + this.poroda + 
        ", возраст - " + this.age + 
        ", команды - " + this.commands.toString();
        return result;
    }

    public void getCommands(){
        System.out.println(this.commands.toString());
    } 
}
