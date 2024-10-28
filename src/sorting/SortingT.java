package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingT {

    public static void main(String[] args) {
        int[] array={95,7,58,45,0};
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }

    static void quickSort(int[] array,int lb,int ub)
    {

        if (lb<ub)
        {
            int loc=partition(array,lb,ub);
            quickSort(array,lb,loc-1);
            quickSort(array,loc+1,ub);
        }
    }

    static int partition(int[] array,int lb,int ub)
    {
        int pivot=array[lb];

        int start=lb;
        int end=ub;

        while(start<end)
        {
            while(start<=ub && array[start]<=pivot)
            {
                start++;
            }

            while(array[end]>pivot)
            {
                end--;
            }

            if(start<end)
            {
                swap(array,start,end);
            }
        }

        swap(array,lb,end);
        return end;
    }

    static void swap(int[] array ,int n1,int n2)
    {

        int temp=array[n1];
        array[n1]=array[n2];
        array[n2]=temp;
    }
}
