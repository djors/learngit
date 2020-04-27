package com.sit.teach.services;


import org.springframework.stereotype.Service;

@Service
public class LiveServer {

    public String live(){

        return "rtmp";
    }
    public void insertSort(int[] a){
        for(int i=1;i<a.length-1;i++){
            int tmp;
            int j=i;
            while(j>0&&a[j]<a[j-1]){
                tmp=a[j-1];
                a[j-1]=a[j];
                a[j]=tmp;
                j--;
            }
        }
        System.out.println(a);
    }

}
