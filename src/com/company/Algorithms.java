package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Algorithms {
    public static ArrayList<Integer> fileDuplicates(){
        Scanner file1 = new Scanner(new File("file1.txt"));
        Scanner file2 = new Scanner(new File("file2.txt"));
        ArrayList<Integer> f1 = new ArrayList<Integer>();
        ArrayList<Integer> f2 = new ArrayList<Integer>();
        for(int i=0;i<20;i++){
            f1.add(file1.nextInt());
        }
        for(int i=0;i<20;i++){
            f2.add(file2.nextInt());
        }
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for(int i=0;i<20;i++){
            for(int j=0;j<20;j++){
                if(f1.get(i)==f2.get(j)){
                    ret.add(f2.get(j));
                }
            }
        }
        return ret;
    }
    public static ArrayList<String> fileDuplicatesTwo(){
        Scanner names = new Scanner(new File("names.txt"));
       String ori="";
       ArrayList<String> ret= new ArrayList<String>();
       int count=0;
        while(names.hasNext()){
            ori+=names.next();
            ret.add(names.next());
            count++;
        }
        System.out.println(ori);
        for(int i=0;i<count;i++){
            for(int j=0;j<count;j++){
                if(ret.get(i)==ret.get(j)){
                    ret.remove(i);
                    ret.remove(j);
                    i--;
                    j--;
                }
            }
        }
        return ret;
    }
    public static ArrayList<Integer> orderedList(){
        Scanner file1 = new Scanner(new File("file1.txt"));
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=1;i<20;i++){
            int cur=file1.nextInt();
            int j=i-1;
            int num=file1.nextInt();
            while(j>=0&&cur< num){
                list.set(j+1, num);
                j--;
            }
            list.set(j+1,cur);
        }
        return list;
    }
}
