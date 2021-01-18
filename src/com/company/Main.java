package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int age = 16;
        int temperature = 20;

        System.out.println(ageTemp(age, temperature));
        System.out.println(ageTemp(generateRandomAge(), age));
//        от >=    do <= (esle if если же)  (if это если)
    }

    public static String ageTemp(int age, int temperature) {
        if (age >= 20 && age >= 45 && temperature >= -20 && temperature <= 30) {

            return "можно идти гулять";
        } else if (age < 20 && temperature <= 0 && temperature >= 28) {
            return "можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 20) {
            return "оставайтесь дома";
        }
        else {
            return "оставайтесь дома";
        }
    }

    public static int generateRandomAge(){
        Random random = new Random();
        return random.nextInt(17);

    }
}