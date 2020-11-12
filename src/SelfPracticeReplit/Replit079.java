package SelfPracticeReplit;

import java.util.Scanner;

public class Replit079 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if(word.substring(0,1).equalsIgnoreCase("X")){
            word = word.substring(1);
        }
          int lastCharIndex = word.length()-1;
          String lastCharIndexStr = word.substring(lastCharIndex);
          if (lastCharIndexStr.equalsIgnoreCase("X")){
              word = word.substring(0,lastCharIndex);
          }
        System.out.println(word);
    }
}