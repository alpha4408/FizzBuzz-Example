package com.apsucodes.datastructures;

public class Main {

    public static void main(String[] args) {

        /*"Write a program that prints the numbers from 1 to 100.
        But for multiples of three print “Fizz” instead of the number and
        for the multiples of five print “Buzz”.
        For numbers which are multiples of both three and five print “FizzBuzz”."
         */

       for(int i = 1 ; i<=100; i++){
           if(i % 3 ==0 && i % 5 == 0)
               System.out.println("FizzBuzz: " +""+ i);
           if(i%3 == 0)
               System.out.println("Fizz: " +"" + i);
           if(i%5 == 0)
               System.out.println("Buzz: "+"" + i);
           else
               System.out.println("This number does not fit the above conditions: " +""+ i);
       }

    }
}
