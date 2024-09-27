package com.aditya.code;

public class ReverseEachWord {
    public static void main(String[] args) {

        String sentece = "Sometimes the quietest moments speak the loudest";
        String [] words = sentece.split(" ");

        String rev ="";
        String result="";
        for (int i=0; i<words.length;i++){

            for(int j=words[i].length()-1; j>=0;j--){
                rev=rev+words[i].charAt(j);
            }
           //System.out.print(rev);
            result = result+" "+rev;

            rev="";
        }
        System.out.println(result);
    }
}

