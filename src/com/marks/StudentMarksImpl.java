package com.marks;

public class StudentMarksImpl {
    public static void main(String[] args) {
        StudentMarks studentMarks = new StudentMarks();
        System.out.println("Sum of marks of medical pathway student ="+ studentMarks.calculateMarks(70,80,75,85));
        System.out.println("Sum of marks of non-medical pathway student =" + studentMarks.calculateMarks(80,85,90));
        System.out.println("Sum of marks of business pathway student =" + studentMarks.calculateMarks(85.5,65.6,90.7));
    }
}
