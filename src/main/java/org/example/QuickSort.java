package org.example;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums={5,1,2,3,4,6};
        quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void quickSort(int[] nums,int left,int right){
        if(left<=right){
            int mid=partion(nums,left,right);
            quickSort(nums,left,mid-1);
            quickSort(nums,mid+1,right);
        }
    }

    private static int partion(int[] nums, int left, int right) {
        int pivot=nums[left];
        int i=left+1;
        int j=right;
        while (true){
            while (i<=j&&nums[i]<=pivot){
                i++;
            }
            while (i<=j&&nums[j]>=pivot){
                j--;
            }
            if(i>=j) {
                break;
            }
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        nums[left]=nums[j];
        nums[j]=pivot;
        return j;
    }
}
