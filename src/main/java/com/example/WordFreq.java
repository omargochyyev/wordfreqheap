package com.example;

//represents phrase + frequency
//element type of building maxheap


public class WordFreq {

    public int freq;
    public String word;

    //word freq object
    public WordFreq(String word, int freq){
        this.word = word;
        this.freq = freq;
    }  

    //tostring to return formatted string

    @Override
    public String toString(){
        return word + "(" + freq + ")";
    }

}