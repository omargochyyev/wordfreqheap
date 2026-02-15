package com.example;

public class WordFreq {

    public int freq;
    public String word;

    public WordFreq(String word, int freq){
        this.word = word;
        this.freq = freq;
    }

    @Override
    public String toString(){
        return word + "(" + freq + ")";
    }

}