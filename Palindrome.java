

public class Palindrome {
    String word;
    boolean isPalindrome;
    boolean comparingLetters = true;
    int letter;
    int lastLetter;
    
    public Palindrome(String wd) {
        this.word = wd;
    }
    
    public boolean testPalindrome() {
        int lastLetter = word.length()-1;
        System.out.println(lastLetter);
        while(comparingLetters == true) {
            for(int i = 0; i < (word.length()/2); i++) {
                System.out.println("hi");
                System.out.println(word.substring(letter,letter+1));
                System.out.println(word.substring(lastLetter));
                if(word.substring(letter,letter+1) == word.substring(lastLetter)){
                    comparingLetters = true;
                    letter++;
                    lastLetter--;
                    System.out.println(lastLetter);
                }
                else {
                    comparingLetters = false;
               }
          }
        }
        if(lastLetter == 0) {
            isPalindrome = true;
        }
        return isPalindrome;
    }
    
 }
