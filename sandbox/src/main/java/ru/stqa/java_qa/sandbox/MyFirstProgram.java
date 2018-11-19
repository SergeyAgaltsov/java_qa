package ru.stqa.java_qa.sandbox;

public class MyFirstProgram {

   public static void main(String[] args) {
      hello ("user");
      hello("world");
      hello("Sergey");

      Square s = new Square(5);
      System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

      Rectangle r = new Rectangle(6,8);
      System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
   }

   public static void hello(String somebody){
      System.out.println("Hello, " + somebody + "!" );
   }
}


