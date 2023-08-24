package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class display {
    public static void ShowMainMenu() {
        System.out.println("Выберите команду:\n"+
        "1. Показать животных\n"+
        "2. Добавить животное\n"+
        "3. Дрессировать животное\n"+
        "4. Выход");
    }

    public static void animalMenu(){
        System.out.println("Выберите команду:\n"+
        "1. Показать команды\n"+
        "2. Обучить животное новой команде\n"+
        "3. Вернуться в меню\n"+
        "4. Показать команды животных\n+"+
        "5. Записать реестр в файл");
    }

    public static void printAnimals(Map <String,ArrayList> animals){
       for(Map.Entry<String,ArrayList> item : animals.entrySet()){
            System.out.printf("Класс %s\n", item.getKey());
            ArrayList ar = item.getValue();
            for (Object object : ar) {
                System.out.println(object.toString());
            }
       };
    }

    public static void commandMenu(){
        System.out.println("Выберите класс животных:\n 1. Собаки\n 2. кошки\n 3. Хомяки");
    }

    public static void commandChoice(){
        System.out.println("Выберите команду:\n 1. Голос\n 2. Сидеть");
    }
}
