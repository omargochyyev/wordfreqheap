package com.example;
import java.util.Arrays;

public final class MaxHeapWordFreq{

    //build max heap bottom up

    public static void buildMaxHeap(WordFreq[] a){
        if (a == null) throw new IllegalArgumentException("array is null");

        //the last non leaf is floor(n/2) - 1:
        for(int i = a.length / 2 - 1; i >= 0; i--){
            maxHeapify(a, i, a.length);
        }

        //Iterativee max heapify
    }


        private static void maxHeapify(WordFreq[] a, int i, int heapSize){
            while (true) { 
                int left = 2 * i + 1;
                int right = 2 * i + 2;

                int largest = i;

                if(left < heapSize && a[left].freq > a[largest].freq){
                    largest = left;
                }
                if(right < heapSize && a[right].freq > a[largest].freq) {
                    largest = right;
                }

                if(largest == i) return;

                swap(a, i, largest);
                i = largest;
            }
        }
            
        
        //swap method
        private static void swap(WordFreq[] a, int i, int j){
            WordFreq temp = a[i];
            a[i] = a[j];
            a[j] = temp;     
        }
        

        public static void main(String[] args){

            WordFreq[] data = new WordFreq[] {
                new WordFreq("happy", 400),
                new WordFreq("satisfied", 100),
                new WordFreq("neutral", 300),
                new WordFreq("would buy again", 200),
                new WordFreq("terrible", 160),
                new WordFreq("inconvenient", 900),
                new WordFreq("difficult to use", 100),
                new WordFreq("easy to use", 140),
                new WordFreq("would recommend to friends", 800),
                new WordFreq("visit the store", 700)
            };

            System.out.println("Before the heapify: ");
            System.out.println(Arrays.toString(data));

            buildMaxHeap(data);

            System.out.println("after heapified order");
            System.out.println(Arrays.toString(data));

        }

    
}
