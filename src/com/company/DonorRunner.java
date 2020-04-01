package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class DonorRunner {
    public static ArrayList<Donor> readFile() throws FileNotFoundException {
        Scanner input = new Scanner(new File("donors.txt"));
        ArrayList<Donor> ret= new ArrayList<Donor>();

        while(input.hasNext()){
            String in = input.nextLine();
            String nam = in.substring(0,in.indexOf(" "));
            double amo = Double.parseDouble(in.substring(in.indexOf(" ")));
            Donor obj = new Donor(nam,amo);
            ret.add(obj);
        }
        return ret;
    }

    public static ArrayList<Donor> sortDonors(ArrayList<Donor> arr){
        for(int next = 1; next<arr.size(); next++){
            //current
            Donor donorcur=arr.get(next);
            double cur=donorcur.getAmount();
            //next
            int i=next-1;
            Donor donori=arr.get(i);
            double vali=donori.getAmount();
            //loop
            while(i>=0&&cur<vali){
                arr.set(i+1,donori);
                i--;
            }
            arr.set(i+1,donorcur);
        }
        return arr;
    }

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Donor> don = readFile();
        sortDonors(don);
        System.out.println(don);
    }

}
