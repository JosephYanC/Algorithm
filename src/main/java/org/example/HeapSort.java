package org.example;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] nums={5,2,1,3,4,6};
        heapSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void heapSort(int[] nums){
        int n=nums.length;
        for (int i = (nums.length-2)/2; i >=0 ; i--) {
            downAdjust(nums,i,n-1);
        }

        for (int i = n-1; i >0 ; i--) {
            int temp=nums[i];
            nums[i]=nums[0];
            nums[0]=temp;

            downAdjust(nums,0,i-1);
        }
    }

    private static void downAdjust(int[] nums, int parent, int len) {
        int temp=nums[parent];
        int child=parent*2+1;
        while (child<=len){
            if(child+1<=len&&nums[child]<=nums[child+1]){
                child++;
            }
            if(temp>=nums[child]){
                break;
            }
            nums[parent]=nums[child];
            parent=child;
            child=parent*2+1;
        }
        nums[parent]=temp;

    }
}
