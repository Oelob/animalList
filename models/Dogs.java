package models;

import java.util.ArrayList;
import java.util.Scanner;

public class Dogs extends Animals{
    private ArrayList commands = new ArrayList<>();
    
    public Dogs(String name, String poroda, int age) {
        super(name, poroda, age);
        commands.add(Animals.commands.get(0));
        commands.add("сидеть");
    }

    public void sitdawn(String name){
        double skill = 0;
        while (skill < 1){
            
            Scanner sc = new Scanner(System.in);
            System.out.printf("Навык животного %.2f%% %n", skill*100);
            System.out.println("Провести тренировку?\n1. Да\n2. Нет\n");
            int a = sc.nextInt();
            if (a == 1){
                skill+=0.2;
            }
            else{
                break;
            }
        } 
        System.out.println("Ваша собака " + name + " умеет сидеть");
        this.skill = true;
    }


    @Override
    public String getVoice() {
       String result = "Собака " + this.name + " говорит гав-гав!!!";
        return result;
    }

    public Boolean getSkill(){
        return this.skill;
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