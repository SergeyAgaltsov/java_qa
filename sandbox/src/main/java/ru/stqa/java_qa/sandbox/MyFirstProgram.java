package ru.stqa.java_qa.sandbox;

public class MyFirstProgram {

   public static void main(String[] args) {
      hello ("user");
      hello("world");
      hello("Sergey");

      double len = 5;
      System.out.println("Площадь квадрата со стороной " + len + " = " + area(len));

      double a = 6;
      double b = 8;
      System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a,b));
   }

   public static void hello(String somebody){
      System.out.println("Hello, " + somebody + "!" );
   }

   public static double area (double len){
      return len * len;
   }

   public static double area (double a, double b){
      return a * b;
   }
}


