package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter your Name:");
        String Name=input.nextLine();
        System.out.println("Enter your Birthday in this format \"dd:MM:yyyy:HH:mm:ss\" Eg:01-01-2000:23:11:00");
        String bday=input.nextLine();
        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd:MM:yyyy:HH:mm:ss", Locale.ENGLISH);
        LocalDateTime birthday=LocalDateTime.parse(bday,formatter);
        LocalDateTime today=LocalDateTime.now();
        long diffInDays =java.time.Duration.between(birthday,today).toDays();
        long diffInMinute =java.time.Duration.between(birthday,today).toMinutes();
        System.out.println("\nDear "+Name+" you've Spent "+diffInDays+" Days / "+diffInMinute+" Minutes in this World.\nSpend the rest of the minutes \"WISELY\"\nMay you Achieve Your Dreams Soon!");
    }
}