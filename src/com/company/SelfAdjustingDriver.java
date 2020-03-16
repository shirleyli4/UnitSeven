package com.company;

import java.util.ArrayList;

public class SelfAdjustingDriver {
    public static void main(String[] args){
        //Test 1
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(12);
        list2.add(14);
        list2.add(8);
        list2.add(2);
        list2.add(0);
        SelfAdjusting obj1=new SelfAdjusting(list2);
        System.out.println("input: "+obj1.getList());
        obj1.adjustList();
        System.out.println("output: "+obj1.getList());

        //Test 2
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list3.add(11);
        list3.add(14);
        list3.add(11);
        list3.add(8);
        list3.add(13);
        list3.add(0);
        SelfAdjusting obj2=new SelfAdjusting(list3);
        System.out.println("input: "+obj2.getList());
        obj2.adjustList();
        System.out.println("output: "+obj2.getList());
    }
}
