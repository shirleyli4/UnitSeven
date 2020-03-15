package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Traversing {
    public static ArrayList<String> getStates() {
        Scanner input = new Scanner(System.in);
        ArrayList<String> states = new ArrayList<String>();
        System.out.println("Enter the name of a state or \"Stop\" to quit:");
        String cur = input.nextLine();

        if(cur.compareTo("Stop")==0){
            return states;
        }
        else {
            states.add(cur);
            System.out.println("Next state or \"Stop\": ");
            do {
                states.add(cur);
            } while (cur.compareTo("Stop") != 0);
        }
        return states;
    }

    public static String createList(ArrayList<String> states) {
        String ret = "";
        for (int i = 0; i < states.size() - 1; i++) {
            ret += states.get(i) + " -> ";
        }
        ret += states.get(states.size() - 1);
        return ret;
    }

    public static ArrayList<Integer> largeAndSmallest() throws FileNotFoundException {
        Scanner input = new Scanner(new File("numbers.txt"));
        ArrayList<Integer> ret = new ArrayList<Integer>();
        while (input.hasNext()) {
            ret.add(input.nextInt());
        }
        int big=ret.get(0);
        int sm=ret.get(0);
        for (int i = 1; i < ret.size(); i++) {
            if(ret.get(i)>=big){
                big=ret.get(i);
            }
            if(ret.get(i)<=sm){
                sm=ret.get(i);
            }
        }
        for(int i=ret.size()-1;i>=0;i--){
            if(ret.get(i)==big||ret.get(i)==sm){
                ret.remove(i);
            }
        }
        ret.add(0,sm);
        ret.add(big);
        return ret;
    }



}



