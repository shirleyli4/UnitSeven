package com.company;

import java.util.ArrayList;

/**
 * @author Shirley Li
 * @since 3/16/20
 *This program is dedicated to rearrange the list in order to process the searching method
 */

public class SelfAdjusting {
    private ArrayList<Integer> list = new ArrayList<Integer>();

    /**
     *Constructor
     * @param list1
     */
    public SelfAdjusting(ArrayList<Integer> list1){
        list = list1;
    }

    /**
     *Accessor
     * @return
     */
    public ArrayList<Integer> getList() {
        return list;
    }

    /**
     *this method will take no parameters and will return nothing.
     * The list initially contains the first 10 even numbers. That is, 2 is in position 0,
     * 4 in position 1, 6 in position 2, 20 is in position 9. You’ll then be given some numbers to process.
     * For each number, search the list. If the number is there, move it to the front of the list;
     * otherwise, add it to the front.
     */
    public void adjustList(){
        //remove the zero
        list.remove(list.size()-1);

        //traverse the input value array
        //and remove all input val from list
        ArrayList<Integer> ori = new ArrayList<Integer>();
        for(int i=0;i<list.size();i++){
            ori.add(list.get(i));
            list.remove(i);
            i--;
        }

        //add the initial numbers to the list 2-20
        for(int i=0;i<10;i++){
            list.add(2*i+2);
        }

        //add input numbers
        for(int i=0;i<ori.size();i++){
            for(int j=list.size()-1;j>=0;j--) {
                if (ori.get(i) == list.get((j))) {
                    list.add(0, ori.get(i));
                    list.remove(j+1);
                }
            }
            if(ori.get(i)%2!=0){
                for(int k=list.size()-1;k>=0;k--){
                    if(list.get(k)==ori.get(i)){
                        list.remove(k);
                    }
                }
                list.add(0, ori.get(i));
            }
        }
    }
}
