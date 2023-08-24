import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

import models.Animals;
import models.Cats;
import models.Commands;
import models.Dogs;

import models.Hamsters;
import netscape.javascript.JSObject;
import view.*;


public class presenter {

    public static void Menu() throws FileNotFoundException, IOException {
        Map reestr = new HashMap<>();
        ArrayList<Dogs> dogs = new ArrayList<>();
        ArrayList<Cats> cats = new ArrayList<>();
        ArrayList<Hamsters> humsters = new ArrayList<>();
        
        while (true) {
            Scanner sc = new Scanner (System.in);
            display.ShowMainMenu();
            int a = sc.nextInt();
            if(a == 1){
                display.printAnimals(reestr);
            }else if (a == 2){
                System.out.println("Выберите класс животного:\n 1. Собаки\n 2. Кошки\n 3. Хомячки");
                int clas = sc.nextInt();
                if(clas == 1){
                    HashMap<String, Object> animal = InputInfo.inputInfo();
                    Dogs dog = new Dogs((String)animal.get("name"),
                                        (String)animal.get("poroda"),
                                        (int)animal.get("age"));
                    
                    dogs.add(dog);
                    reestr.put("dogs", dogs);
                }else if (clas == 2){
                    HashMap<String, Object> animal = InputInfo.inputInfo();
                    Cats cat = new Cats((String)animal.get("name"),
                                        (String)animal.get("poroda"),
                                        (int)animal.get("age"));
                    cats.add(cat);
                    reestr.put("cats", cats);

                }else if (clas == 3){
                    HashMap<String, Object> animal = InputInfo.inputInfo();
                    Hamsters hms = new Hamsters((String)animal.get("name"),
                                                (String)animal.get("poroda"),
                                                (int)animal.get("age"));
                    humsters.add(hms);
                    reestr.put("humsters",humsters);
                }
                    
            }else if (a == 4){
                break;
            }else if (a == 3){
                display.commandMenu();
                System.out.println();
                int clas = sc.nextInt();
                if (clas == 1){
                   System.out.println("Доступные команды: ");
                    Dogs.getCommands();
                   System.out.println("Список собак: ");
                   for (Object dog: dogs) {
                        System.out.println(dog.toString());
                   }
                   sc.nextLine();
                   System.out.println("Выберите команду: ");
                   String cmd = sc.nextLine();
                   System.out.println("Введите кличку собаки: ");
                   String name = sc.nextLine();
                   if (cmd.equals("голос")){
                    for (Dogs  dog : dogs) {
                        if (dog.getName().equals(name)){
                           System.out.println(dog.getVoice());
                        }
                    }
                   }else if (cmd.equals("сидеть")){
                    for (Dogs  dog : dogs) {
                        if (dog.getName().equals(name)){
                           System.out.println(dog.getSkill());
                            dog.sitdawn(dog.getName());
                            System.out.println(dog.getSkill());
                        }
                    }
                   }

                }
            }
            
            else if (a == 0){
                try (FileWriter fw = new FileWriter("animals.txt",true)) {
                    fw.write(reestr.toString()+"\n");
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
            
        }
    }   
}


