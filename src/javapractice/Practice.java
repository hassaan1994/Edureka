package javapractice;

import java.util.ArrayList;
import java.util.LinkedList;

public class Practice {

    public static void main(String[] args) {
        int Numbers[] = {12, 32, 65, 85, 92};
        System.out.println(Numbers[2]);
        for (int i = 0; i<Numbers.length; i++){
            System.out.println(Numbers[i]);
        }

        String fruits[]= {"orange","apple","mango","banana"};
        System.out.println(fruits[1]);
        for (int i=0; i<fruits.length; i++){
            System.out.println(fruits[i]);
        }

        ArrayList cars = new ArrayList();
        cars.add("Audi Q7");
        cars.add("Bmw X7");
        cars.add("Mercedes GLE 63 Coupe");
        cars.add("Porsche Cayenne Turbo Gt Coupe");
        System.out.println(cars);
        System.out.println(cars.contains("Bmw X7"));

        LinkedList <String> computer = new <String> LinkedList();
        computer.add("Hp");
        computer.add("Dell");
        computer.add("Lenovo");
        computer.add("Apple");
        computer.remove("Apple");
        System.out.println(computer.contains("Asus"));
        System.out.println(computer);


    }
}
