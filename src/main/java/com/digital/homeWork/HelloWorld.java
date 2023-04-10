package com.digital.homeWork;

public class HelloWorld {
    public static void main(String[] args) {
                String tag = "b";
                String word = "Hello, world!";
                String result = surroundWithTag(tag, word);
                System.out.println(result);
            }

            public static String surroundWithTag(String tag, String word) {
                return "<" + tag + ">" + word + "</" + tag + ">";
            }
        }





