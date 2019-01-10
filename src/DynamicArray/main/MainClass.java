/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicArray.main;

import DynamicArray.utils.MyList;

/**
 *
 * @author BibekShrestha
 */
public class MainClass {

    public static void main(String[] args) {
        MyList list = new MyList();
        list.add(120);
        list.add(120);
        list.add(3434);
        list.add(120);
        list.add(12112);
        
//        for(int i : list.getAll()){
//            System.out.println(i);
//        }

        System.out.println(list.getIndex(2));
        
    }
}
