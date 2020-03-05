package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListOfRectangles {
    public static ArrayList<Rectangle> getRectangle() throws IOException {
        Scanner input = new Scanner(new File("Rectangle.txt"));
        ArrayList<Rectangle> ret = new ArrayList<Rectangle>();
        while (input.hasNext()) {
            Rectangle rec1 = new Rectangle(input.nextDouble(), input.nextDouble());
            ret.add(rec1);
        }
        return ret;
    }

    public static double findAverage(ArrayList<Rectangle> rectangles) {
        double total = 0.0;
        int num = 0;
        for (int i = 0; i < rectangles.size(); i++) {
            total += (rectangles.get(i)).area();
            num++;
        }
        double aver = total/num;
        return aver;
    }

    public static void main(String[] args) throws IOException {
        findAverage(getRectangle());

    }
}
