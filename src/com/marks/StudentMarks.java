package com.marks;

public class StudentMarks {
    //calculating marks of medical pathway students
    public int calculateMarks(int maths,int physics,int chemistry,int biology){
        int sum = maths + physics + chemistry + biology;
        return sum;
    }

    //calculating marks of nonmedical pathway students
    public int calculateMarks(int maths,int physics,int chemistry){
        int sum = maths + physics + chemistry;
        return sum;
    }

    //calculating marks of business pathway students
    public double calculateMarks(double businessStudies,double finance,double accounting ){
        double sum = businessStudies + finance + accounting;
        return sum;
    }
}
