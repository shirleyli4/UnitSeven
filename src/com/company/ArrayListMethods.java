package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListMethods {
    public static Scanner input=new Scanner(System.in);
    public static ArrayList<Integer> numberList() {
        ArrayList<Integer> ret= new ArrayList<Integer>(5);
        ret.add(0);
        ret.add(-5);
        ret.add(7);
        ret.add(12);
        ret.add(-1);
        for(int i=0;i<ret.size();i++){
            System.out.print(ret.get(i)+" ");
        }
        ret.add(2,10);
        ret.set(ret.indexOf(-5),9);
        for(int i=0;i<ret.size();i++){
            System.out.print(ret.get(i)+" ");
        }
        ret.remove(4);
        for(int i=0;i<ret.size();i++){
            System.out.print(ret.get(i)+" ");
        }
        return ret;
    }
    public static ArrayList<Double> firstAndLast(){
        System.out.print("Enter your numbers:");
        ArrayList<Double>ret=new ArrayList<Double>();
        while(true){
            ret.add(input.nextDouble());
            break;
        }
        ret.add(0,(double)(ret.size()));
        for(int i=2;i<ret.size()-1;i++){
            ret.remove(i);
        }
        return ret;
    }
    public static ArrayList<Double> getNumbers(){
        ArrayList<Double>num=new ArrayList<Double>(3);
        for(int i=0;i<3;i++){
            num.add(input.nextDouble());
        }
        return num;
    }
    public static ArrayList<Double> arrangeList(ArrayList<Double> numbers){
        double min=numbers.get(0);
        double max=numbers.get(2);
        double mid=numbers.get(1);
        for(int a = 0;a<numbers.size();a++) {
            if (numbers.get(a) < min) {
                min = numbers.get(a);
            }
        }
        for(int a = 0;a<numbers.size();a++) {
            if (numbers.get(a) > max) {
                max = numbers.get(a);
            }
        }
        for(int a = 0;a<numbers.size();a++) {
            if (numbers.get(a) < max && numbers.get(a) > min) {
                mid = numbers.get(a);
            }
        }
            numbers.set(0,min);
            numbers.set(1,mid);
            numbers.set(2,max);
        return numbers;
    }

}
