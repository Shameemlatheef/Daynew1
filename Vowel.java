package com.Day3;

import org.omg.PortableInterceptor.ServerRequestInfo;

public class Vowel {
    String S="A";
    String vowele="aeiou";
    String consonent="bcdfghjklmnpqrstvwxyz";

    public static void main(String[] args) {
        Vowel v=new Vowel();

int count=0;
        for (int i=0;i<v.vowele.length();i++)
        {
            if(v.vowele.charAt(i)==v.S.charAt(0)){
                System.out.println("vowel");

                break;
            }
            else {
                for (int j=0;j<v.consonent.length();j++)
                {
                    if(v.consonent.charAt(j)==v.S.charAt(0))
                    {
                        count++;

                        break;

                    }


                }
                if (count>0){
                    System.out.println("consonent");
                    break;
                }
                else {
                    System.out.println("invalid");
                    break;
                }
            }
        }

    }
}
