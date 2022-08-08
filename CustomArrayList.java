package com.apurba.generise;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int [] data;
    private static int DEFAULT_SIZE=10;
    private int size =0;

    public CustomArrayList(){
        this.data= new int[DEFAULT_SIZE];
    }
    public void add(int num){
       if(isFull()){
           resize();
       }
       data[size++]=num;
    }
    public boolean isFull(){
        return size==data.length;
    }
    public  void resize(){
        int []temp= new int[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }
    public int remove(){
        int remove=data[--size];
        return remove;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,int value){
        data[index]=value;
    }
    @Override
    public String toString(){
        return "CustomArray{"+"data="+ Arrays.toString(data)+"size="+size+"}";
    }

    public static void main(String[] args) {
        ArrayList obj = new ArrayList();
        obj.add(7);
        System.out.println(obj);
        CustomArrayList list = new CustomArrayList();
        list.add(9);
        list.add(5);
        System.out.println(list);
        int c= list.remove();
        System.out.println(c);
        System.out.println(list);


    }





}
