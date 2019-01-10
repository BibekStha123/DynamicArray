/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicArray.utils;

/**
 *
 * @author BibekShrestha
 */
public class MyList {

    private int[] nums = new int[0];

    public void add(int num) {
        if (nums.length == 0) {
            nums = new int[1];
            nums[0] = num;
        } else {
            int[] nums1 = new int[size() + 1];
            for (int i = 0; i < size(); i++) {
                nums1[i] = nums[i];
            }

            nums1[size()] = num;
            nums = nums1;
        }
    }

    public int size() {
        return nums.length;
    }

    public void print() {
        for (int i = 0; i < size(); i++) {
            System.out.println(nums[i]);
        }
    }

    public int[] getAll() {
        return nums;
    }
    
    public int getIndex(int i){
        return nums[i];
    }
    
}
