package org.example;


public class Main {
    public static void main(String[] args) {
    }

    public static boolean checkForPalindrome(String text){
        if(text == null) return false;

        String cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleanText).reverse().toString();

        return cleanText.equals(reversed);
    }

    public static String convertDecimalToBinary(int decimal){
        if(decimal == 0) return "0";

        StringBuilder binary = new StringBuilder();

        while(decimal > 0){
            int remainder = decimal % 2;
            binary.append(remainder);
            decimal = decimal / 2;
        }

        return binary.reverse().toString();
    }

}