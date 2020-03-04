package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListOfRectangle {
    public static ArrayList<Rectangle> getRectangle() throws FileNotFoundException {
        Scanner input = new Scanner(new File("Rectangle.txt"));
        ArrayList<Rectangle>ret=new ArrayList<Rectangle>();
        while(input.hasNext()){
            Rectangle rec1 = new Rectangle(input.nextDouble(),input.nextDouble());
            ret.add(rec1);
        }
        return ret;
    }
    public static double findAverage(ArrayList<Rectangle> rectangles){
        double total=0.0;
        int num=0;
        for(int i=0;i<rectangles.size();i++){
            total+=(rectangles.get(i)).area();
            num++;
        }
        double aver = (int)(total/num*100)/100;
        return aver;
    }
    public static void main(String[] args) throws FileNotFoundException {
        findAverage(getRectangle());

    }
}
