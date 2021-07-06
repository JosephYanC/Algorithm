package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class MergeSort
{
    public static void main( String[] args )
    {
        int[] nums={5,3,6,2,1,4};
        mergeSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));

    }
    public static void mergeSort(int[] nums,int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            mergeSort(nums,left,mid);
            mergeSort(nums,mid+1,right);
            merge(nums,left,mid,right);
        }
    }
    public static void merge(int[] nums,int left,int mid,int right){
        int[] arr=new int[right-left+1];
        int i=left,j=mid+1;
        int k=0;
        while (i<=mid&&j<=right){
            if (nums[i]<=nums[j]){
                arr[k++]=nums[i++];
            }else{
                arr[k++]=nums[j++];
            }
        }

        while(i<=mid){
            arr[k++]=nums[i++];
        }
        while (j<=right){
            arr[k++]=nums[j++];
        }

        for (int l = 0; l < k; l++) {
            nums[left++]=arr[l];
        }
    }
}

