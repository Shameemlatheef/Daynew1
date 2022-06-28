package com.Day3;

public class Wheather {








    public static void main(String[] args) {


        boolean isSnowing = false;
        boolean isRaining = true;
        double temperature = 60.0;
        if(isSnowing==true | isRaining==true | temperature<50){
            System.out.println("let stay home");
        } else if (isRaining==false&& isSnowing==false && temperature>50) {
            System.out.println("Lets go out");

        }
    }


}
