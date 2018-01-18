package com.example;

import java.nio.channels.Channel;

public class CamelCaser {

    public static void main(String[] args) {
	// write your code here
        System.out.println(camelCase("test this"));
    }

    public static String camelCase(String inputString){
        String outputString = "";

        Character previousChar = inputString.charAt(0);
        outputString += previousChar;

        for (int i = 1; i < inputString.length(); i++) {
            if(inputString.charAt(i) != ' '){
                if(previousChar == ' '){
                    outputString += Character.toUpperCase(inputString.charAt(i));
                } else {
                    outputString += inputString.charAt(i);
                }
            }
            previousChar = inputString.charAt(i);

        }
        return outputString;
    }
}
