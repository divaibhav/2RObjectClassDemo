/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 04-Sep-20
 *  Time: 11:15 AM
 */
package main;

import databean.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollNo(11);
        s1.setName("vaibhav");
        Student s2 = new Student();
        s2.setName("vaibhav");
        s2.setRollNo(11);
        String str = "abc";

        //s1  and s2 are equal?
        System.out.println("s1 equals s2 => " + s1.equals(s2));
    }
}
