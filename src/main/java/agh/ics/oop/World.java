package agh.ics.oop;

import java.util.Arrays;

public class World {
    public static void main(String[] args) {
        System.out.println("system wystartował");
        String[] argumenty = {"r","l","b","f"};


        System.out.println("system zakończył działanie");
    }

    public static void run(String[] args){

        for(String text: args){
            String message = switch(text) {
                case "f" -> "Do przodu";
                case "b" -> "Do tyłu";
                case "r" -> "W prawo";
                case "l" -> "W lewo";
                default -> "Nieznana komenda";
            };
            System.out.println(message);
        }

    }
}
