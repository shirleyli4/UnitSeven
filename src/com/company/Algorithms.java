package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Algorithms {
    public static ArrayList<Integer> fileDuplicates()throws IOException {
        Scanner file1 = new Scanner(new File("file1.txt"));
        Scanner file2 = new Scanner(new File("file2.txt"));
        ArrayList<Integer> f1 = new ArrayList<Integer>();
        ArrayList<Integer> f2 = new ArrayList<Integer>();
        while (file1.hasNext()){
            f1.add(file1.nextInt());
        }
        while (file2.hasNext()){
            f2.add(file2.nextInt());
        }
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for(int i=0;i<f1.size();i++){
            for(int j=0;j<f2.size();j++){
                if(f1.get(i)==f2.get(j)){
                    ret.add(f2.get(j));
                }
            }
        }
        return ret;
    }
    public static ArrayList<String> fileDuplicatesTwo() throws FileNotFoundException {
        Scanner names = new Scanner(new File("names.txt"));
       ArrayList<String> ret= new ArrayList<String>();
        while(names.hasNext()){
            ret.add(names.next());
        }
        System.out.println(ret);
        for(int i=0;i<ret.size()-1;i++){
            for(int j=i+1;j<ret.size();j++){
                if(ret.get(i).equals(ret.get(j))){
                    ret.remove(j);
                }
            }
        }
        return ret;
    }
    public static ArrayList<Integer> orderedList()throws IOException{
        Scanner file1 = new Scanner(new File("file1.txt"));
        ArrayList<Integer> ret = new ArrayList<Integer>();
        ret.add(file1.nextInt());
        while(file1.hasNext()){
            int cur=file1.nextInt();
            for(int i=0;i<=ret.size()-1;i++){
                if(cur<ret.get(i)){
                    ret.add(i,cur);
                    break;
                }
                if(i==ret.size()-1){
                    ret.add(cur);
                    break;
                }
            }
        }
        return ret;
    }
}
