package models;

import java.util.ArrayList;

public class Hamsters extends Animals{

    private ArrayList commands = new ArrayList<>();
    public Hamsters(String name, String poroda, int age) {
        super(name, poroda, age);
        this.commands.add(super.commands.get(0));
        this.commands.add("есть за обе щеки");
        
    }

    @Override
    public String getVoice() {
       String result = "Хомяк " + this.name + " говорит хрум-хрум!!!";
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
