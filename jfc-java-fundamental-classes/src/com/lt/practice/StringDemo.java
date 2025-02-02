package com.lt.practice;

public class StringDemo {
    public static void main(String[] args) {
        /**
         * String is a sequence of characters i.e. Array of characters
         * String is a custom datatype, it means it's a premitive datatype
         * String is immutable mean can't change, it is always store at new memory location
         * when we update the string
         *
         */

        String fname = "Rajkumar"; // String literal
        String city = new String("Pune"); // String using new operator

        String sentence = "This is my sentence."; // String literal
        String wordSet = "  Word1 Word2 Word3  ";
        String blank = "    ";
        String empty = "";

        System.out.println(sentence + "sentence.isBlank(): " + sentence.isBlank());
        System.out.println(sentence + "sentence.isEmpty(): " + sentence.isEmpty());

        System.out.println(wordSet + "wordSet.isBlank(): " + wordSet.isBlank());
        System.out.println(wordSet + "wordSet.isEmpty(): " + wordSet.isEmpty());

        System.out.println(blank +"blank.isBlank(): " + blank.isBlank());
        System.out.println(blank +"blank.isEmpty(): " + blank.isEmpty());

        System.out.println(empty +"empty.isBlank(): " + empty.isBlank());
        System.out.println(empty +"empty.isEmpty(): " + empty.isEmpty());

    }

}
