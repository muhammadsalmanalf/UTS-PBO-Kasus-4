/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author ASUS
 */
public class JavaApplication4 {
   public static void main(String[] args)
   {
      Instructor myInstructor =
          new Instructor("Al Faridzi", "Muhammad Salman", "MSAF1112");

      TextBook myTextBook =
          new TextBook("Pengenalan Sitem Informasi",
                       "Abdul Kadir", "Andi Offset");

      Course myCourse = 
         new Course("Information Systems", myInstructor,
                    myTextBook);

      System.out.println(myCourse);
   }
}
