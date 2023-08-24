package view;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InputInfo {
    
    public static HashMap<String, Object> inputInfo(){
        HashMap<String, Object> result = new HashMap<>();
        ArrayList cmds = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кличку животного: ");
        String name = scan.nextLine();
        result.put("name", name);
        System.out.println("Введите породу животного: ");
        String poroda = scan.nextLine();
        result.put("poroda", poroda);
        System.out.println("Введите возраст животного: ");
        int age = scan.nextInt();
        result.put("age",age);
        // scan.nextLine();
        // System.out.println("Введите команду животного: ");
        // String cmd = scan.nextLine();
        // cmds.add(cmd);
        // while (true){   
        //     System.out.println("Есть ли еще команды у животного:\n1. Да\n2. Нет");
        //     int temp = scan.nextInt();
        //     if (temp == 1){
        //         scan.nextLine();
        //         System.out.println("Введите команду животного: ");
        //         scan.hasNextLine();
        //         String cmd2 = scan.nextLine();
        //         cmds.add(cmd2);
        //     }
        //     if (temp == 2){
        //         break;
        //     }
        // }
        // result.put("commands",cmds);
        return result;

    }
}
