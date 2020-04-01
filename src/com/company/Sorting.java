package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sorting {
    public static ArrayList<Integer> getUnsorted() throws FileNotFoundException {
        Scanner input = new Scanner(new File("sortedData1.txt"));
        ArrayList ret = new ArrayList();
        while(input.hasNext()){
            ret.add(input.nextInt());
        }
        return ret;
    }

    public static boolean isSorted(ArrayList<Integer> arr){
        boolean r=true;
        for(int next = 1; next<arr.size(); next++){
            int cur=arr.get(next);
            int i=next-1;
            while(i>=0&&cur<arr.get(i)){
                arr.set(i+1,arr.get(i));
                i--;
                r=false;
            }
            arr.set(i+1,cur);
        }
        return r;
    }


}


