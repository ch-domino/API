package sk.upjs.paz;

import sk.upjs.jpaz2.Turtle;

public class SmartTurtle extends Turtle {

    public int countChar(String s, char c) {
        int pocetVyskytov = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                pocetVyskytov++;
            }
        }
        return pocetVyskytov;
    }

    public boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            int odKonca = s.length() - 1 - i;
            if (s.charAt(i) != s.charAt(odKonca)) {
                return false;
            }
        }
        return true;
    }

    public boolean containsDoubleSpace(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ') {
                return true;
            }
        }
        return false;
    }

}
