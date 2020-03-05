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
        while (input.nextLine() != "Stop") {
            states.add(input.nextLine());
        }
        return states;
    }

    public static String createList(ArrayList<String> states) {
        String ret = "";
        for (int i = 0; i < states.size() - 2; i++) {
            ret += states.get(i) + " -> ";
        }
        ret += states.get(states.size() - 1);
        return ret;
    }

    public static ArrayList<Integer> largeAndSmallest() throws IOException {
        Scanner input = new Scanner(new File("numbers.txt"));
        ArrayList<Integer> ret = new ArrayList<Integer>();
        while (input.hasNext()) {
            ret.add(input.nextInt());
        }
        for (int i = 1; i < ret.size(); i++) {
            int cur = ret.get(i);
            int index = i - 1;
            while (index >= 0 && cur < ret.get(index)) {
                ret.set(index + 1, ret.get(index));
                index--;
            }
            ret.set(index + 1, cur);
        }
        return ret;
    }



}



