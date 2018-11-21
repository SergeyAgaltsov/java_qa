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

      Point p1 = new Point(5, 7);
      Point p2 = new Point(8, 4);
      System.out.println("Расстояние между точками = " + p1.distanceTo(p2));
   }

   public static void hello(String somebody){
      System.out.println("Hello, " + somebody + "!" );
   }
}


