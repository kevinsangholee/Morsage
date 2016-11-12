package com.example.kevinlee.dotmorsage;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Created by kevinlee on 11/11/16.
 */

public class StringToVibrations {

    private static final long DOT = 100;
    private static final long DASH = 300;
    private static final long IN_LETTER= 100;

    private static final long[] A_LETTER = {DOT, IN_LETTER, DASH};
    private static final long[] B_LETTER = {DASH, IN_LETTER, DOT, IN_LETTER, DOT, IN_LETTER, DOT};
    private static final long[] C_LETTER = {DASH, IN_LETTER, DOT, IN_LETTER, DASH, IN_LETTER, DOT};
    private static final long[] D_LETTER = {DASH, IN_LETTER, DOT, IN_LETTER, DOT};
    private static final long[] E_LETTER = {DOT};
    private static final long[] F_LETTER = {DOT, IN_LETTER, DOT, IN_LETTER, DASH, IN_LETTER, DOT};
    private static final long[] G_LETTER = {DASH, IN_LETTER, DASH, IN_LETTER, DOT};
    private static final long[] H_LETTER = {DOT, IN_LETTER, DOT, IN_LETTER, DOT, IN_LETTER, DOT};
    private static final long[] I_LETTER = {DOT, IN_LETTER, DOT};
    private static final long[] J_LETTER = {DOT, IN_LETTER, DASH, IN_LETTER, DASH, IN_LETTER, DASH};
    private static final long[] K_LETTER = {DASH, IN_LETTER, DOT, IN_LETTER, DASH};
    private static final long[] L_LETTER = {DOT, IN_LETTER, DASH, IN_LETTER, DOT, IN_LETTER, DOT};
    private static final long[] M_LETTER = {DASH, IN_LETTER, DASH};
    private static final long[] N_LETTER = {DASH, IN_LETTER, DOT};
    private static final long[] O_LETTER = {DASH, IN_LETTER, DASH, IN_LETTER, DASH};
    private static final long[] P_LETTER = {DOT, IN_LETTER, DASH, IN_LETTER, DASH, IN_LETTER, DOT};
    private static final long[] Q_LETTER = {DASH, IN_LETTER, DASH, IN_LETTER, DOT, IN_LETTER, DASH};
    private static final long[] R_LETTER = {DOT, IN_LETTER, DASH, IN_LETTER, DOT};
    private static final long[] S_LETTER = {DOT, IN_LETTER, DOT, IN_LETTER, DOT};
    private static final long[] T_LETTER = {DASH};
    private static final long[] U_LETTER = {DOT, IN_LETTER, DOT, IN_LETTER, DASH};
    private static final long[] V_LETTER = {DOT, IN_LETTER, DOT, IN_LETTER, DOT, IN_LETTER, DASH};
    private static final long[] W_LETTER = {DOT, IN_LETTER, DASH, IN_LETTER, DASH};
    private static final long[] X_LETTER = {DASH, IN_LETTER, DOT, IN_LETTER, DOT, IN_LETTER, DASH};
    private static final long[] Y_LETTER = {DASH, IN_LETTER, DOT, IN_LETTER, DASH, IN_LETTER, DASH};
    private static final long[] Z_LETTER = {DASH, IN_LETTER, DASH, IN_LETTER, DOT, IN_LETTER, DOT};
    private static final long[] ONE_NUMBER = {DOT, IN_LETTER, DASH, IN_LETTER, DASH, IN_LETTER, DASH, IN_LETTER, DASH};
    private static final long[] TWO_NUMBER = {DOT, IN_LETTER, DOT, IN_LETTER, DASH, IN_LETTER, DASH, IN_LETTER, DASH};
    private static final long[] THREE_NUMBER = {DOT, IN_LETTER, DOT, IN_LETTER, DOT, IN_LETTER, DASH, IN_LETTER, DASH};
    private static final long[] FOUR_NUMBER = {DOT, IN_LETTER, DOT, IN_LETTER, DOT, IN_LETTER, DOT, IN_LETTER, DASH};
    private static final long[] FIVE_NUMBER = {DOT, IN_LETTER, DOT, IN_LETTER, DOT, IN_LETTER, DOT, IN_LETTER, DOT};
    private static final long[] SIX_NUMBER = {DASH, IN_LETTER, DOT, IN_LETTER, DOT, IN_LETTER, DOT, IN_LETTER, DOT};
    private static final long[] SEVEN_NUMBER = {DASH, IN_LETTER, DASH, IN_LETTER, DOT, IN_LETTER, DOT, IN_LETTER, DOT};
    private static final long[] EIGHT_NUMBER = {DASH, IN_LETTER, DASH, IN_LETTER, DASH, IN_LETTER, DOT, IN_LETTER, DOT};
    private static final long[] NINE_NUMBER = {DASH, IN_LETTER, DASH, IN_LETTER, DASH, IN_LETTER, DASH, IN_LETTER, DOT};
    private static final long[] ZERO_NUMBER = {DASH, IN_LETTER, DASH, IN_LETTER, DASH, IN_LETTER, DASH, IN_LETTER, DASH};
    private static final long[] QUESTION = {DOT, IN_LETTER, DOT, IN_LETTER, DASH, IN_LETTER, DASH, IN_LETTER, DOT, IN_LETTER, DOT};
    private static final long[] APOSTROPHE = {DOT, IN_LETTER, DASH, IN_LETTER, DASH, IN_LETTER, DASH, IN_LETTER, DASH, IN_LETTER, DOT};
    private static final long[] EXCLAMATION = {DASH, IN_LETTER, DOT, IN_LETTER, DASH, IN_LETTER, DOT, IN_LETTER, DASH, IN_LETTER, DASH};
    private static final long[] SLASH = {DASH, IN_LETTER, DOT, IN_LETTER, DOT, IN_LETTER, DASH, IN_LETTER, DOT};
    private static final long[] CLOSE_PARENTHESES = {DASH, IN_LETTER, DOT, IN_LETTER, DASH, IN_LETTER, DASH, IN_LETTER, DOT, IN_LETTER, DASH};
    private static final long[] OPEN_PARENTHESES = {DASH, IN_LETTER, DOT, IN_LETTER, DASH, IN_LETTER, DASH, IN_LETTER, DOT};
    private static final long[] AMPERSAND = {DOT, IN_LETTER, DASH, IN_LETTER, DOT, IN_LETTER, DOT, IN_LETTER, DOT};
    private static final long[] COLON = {DASH, IN_LETTER, DASH, IN_LETTER, DASH, IN_LETTER, DOT, IN_LETTER, DOT, IN_LETTER, DOT};
    private static final long[] SEMICOLON = {DASH, IN_LETTER, DOT, IN_LETTER, DASH, IN_LETTER, DOT, IN_LETTER, DASH, IN_LETTER, DOT};
    private static final long[] EQUALS = {DASH, IN_LETTER, DOT, IN_LETTER, DOT, IN_LETTER, DOT, IN_LETTER, DASH};
    private static final long[] PLUS = {DOT, IN_LETTER, DASH, IN_LETTER, DOT, IN_LETTER, DASH, IN_LETTER, DOT};
    private static final long[] MINUS = {DASH, IN_LETTER, DOT, IN_LETTER, DOT, IN_LETTER, DOT, IN_LETTER, DOT, IN_LETTER, DASH};
    private static final long[] UNDERSCORE = {DOT, IN_LETTER, DOT, IN_LETTER, DASH, IN_LETTER, DASH, IN_LETTER, DOT, IN_LETTER, DASH};
    private static final long[] QUOTATION = {DOT, IN_LETTER, DASH, IN_LETTER, DOT, IN_LETTER, DOT, IN_LETTER, DASH, IN_LETTER, DOT};
    private static final long[] DOLLAR = {DOT, IN_LETTER, DOT, IN_LETTER, DOT, IN_LETTER, DASH, IN_LETTER, DOT, IN_LETTER, DOT, IN_LETTER, DASH};
    private static final long[] AT = {DOT, IN_LETTER, DASH, IN_LETTER, DASH, IN_LETTER, DOT, IN_LETTER, DASH, IN_LETTER, DOT};

    private static final long[] BEGINNING_WAIT = {300};
    private static final long[] BETWEEN_LETTERS = {300};
    private static final long[] BETWEEN_WORDS = {700};

    public StringToVibrations() {
    }

    public static long[] concatenateWord(String word) {
        long[] complete = BEGINNING_WAIT;
        for(int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if(letter == 'A' || letter == 'a') {
                complete = ArrayUtils.addAll(complete, A_LETTER);
            }
            if(letter == 'B' || letter == 'b') {
                complete = ArrayUtils.addAll(complete, B_LETTER);
            }
            if(letter == 'C' || letter == 'c') {
                complete = ArrayUtils.addAll(complete, C_LETTER);
            }
            if(letter == 'D' || letter == 'd') {
                complete = ArrayUtils.addAll(complete, D_LETTER);
            }
            if(letter == 'E' || letter == 'e') {
                complete = ArrayUtils.addAll(complete, E_LETTER);
            }
            if(letter == 'F' || letter == 'f') {
                complete = ArrayUtils.addAll(complete, F_LETTER);
            }
            if(letter == 'G' || letter == 'g') {
                complete = ArrayUtils.addAll(complete, G_LETTER);
            }
            if(letter == 'H' || letter == 'h') {
                complete = ArrayUtils.addAll(complete, H_LETTER);
            }
            if(letter == 'I' || letter == 'i') {
                complete = ArrayUtils.addAll(complete, I_LETTER);
            }
            if(letter == 'J' || letter == 'j') {
                complete = ArrayUtils.addAll(complete, J_LETTER);
            }
            if(letter == 'K' || letter == 'k') {
                complete = ArrayUtils.addAll(complete, K_LETTER);
            }
            if(letter == 'L' || letter == 'l') {
                complete = ArrayUtils.addAll(complete, L_LETTER);
            }
            if(letter == 'M' || letter == 'm') {
                complete = ArrayUtils.addAll(complete, M_LETTER);
            }
            if(letter == 'N' || letter == 'n') {
                complete = ArrayUtils.addAll(complete, N_LETTER);
            }
            if(letter == 'O' || letter == 'o') {
                complete = ArrayUtils.addAll(complete, O_LETTER);
            }
            if(letter == 'P' || letter == 'p') {
                complete = ArrayUtils.addAll(complete, P_LETTER);
            }
            if(letter == 'Q' || letter == 'q') {
                complete = ArrayUtils.addAll(complete, Q_LETTER);
            }
            if(letter == 'R' || letter == 'r') {
                complete = ArrayUtils.addAll(complete, R_LETTER);
            }
            if(letter == 'S' || letter == 's') {
                complete = ArrayUtils.addAll(complete, S_LETTER);
            }
            if(letter == 'T' || letter == 't') {
                complete = ArrayUtils.addAll(complete, T_LETTER);
            }
            if(letter == 'U' || letter == 'u') {
                complete = ArrayUtils.addAll(complete, U_LETTER);
            }
            if(letter == 'V' || letter == 'v') {
                complete = ArrayUtils.addAll(complete, V_LETTER);
            }
            if(letter == 'W' || letter == 'w') {
                complete = ArrayUtils.addAll(complete, W_LETTER);
            }
            if(letter == 'X' || letter == 'x') {
                complete = ArrayUtils.addAll(complete, X_LETTER);
            }
            if(letter == 'Y' || letter == 'y') {
                complete = ArrayUtils.addAll(complete, Y_LETTER);
            }
            if(letter == 'Z' || letter == 'z') {
                complete = ArrayUtils.addAll(complete, Z_LETTER);
            }
            if(letter == '1') {
                complete = ArrayUtils.addAll(complete, ONE_NUMBER);
            }
            if(letter == '2') {
                complete = ArrayUtils.addAll(complete, TWO_NUMBER);
            }
            if(letter == '3') {
                complete = ArrayUtils.addAll(complete, THREE_NUMBER);
            }
            if(letter == '4') {
                complete = ArrayUtils.addAll(complete, FOUR_NUMBER);
            }
            if(letter == '5') {
                complete = ArrayUtils.addAll(complete, FIVE_NUMBER);
            }
            if(letter == '6') {
                complete = ArrayUtils.addAll(complete, SIX_NUMBER);
            }
            if(letter == '7') {
                complete = ArrayUtils.addAll(complete, SEVEN_NUMBER);
            }
            if(letter == '8') {
                complete = ArrayUtils.addAll(complete, EIGHT_NUMBER);
            }
            if(letter == '9') {
                complete = ArrayUtils.addAll(complete, NINE_NUMBER);
            }
            if(letter == '0') {
                complete = ArrayUtils.addAll(complete, ZERO_NUMBER);
            }
            if(letter == '?') {
                complete = ArrayUtils.addAll(complete, QUESTION);
            }
            if(letter == 39) {
                complete = ArrayUtils.addAll(complete, APOSTROPHE);
            }
            if(letter == '!') {
                complete = ArrayUtils.addAll(complete, EXCLAMATION);
            }
            if(letter == '/') {
                complete = ArrayUtils.addAll(complete, SLASH);
            }
            if(letter == ')') {
                complete = ArrayUtils.addAll(complete, CLOSE_PARENTHESES);
            }
            if(letter == '(') {
                complete = ArrayUtils.addAll(complete, OPEN_PARENTHESES);
            }
            if(letter == '&') {
                complete = ArrayUtils.addAll(complete, AMPERSAND);
            }
            if(letter == ':') {
                complete = ArrayUtils.addAll(complete, COLON);
            }
            if(letter == ';') {
                complete = ArrayUtils.addAll(complete, SEMICOLON);
            }
            if(letter == '=') {
                complete = ArrayUtils.addAll(complete, EQUALS);
            }
            if(letter == '+') {
                complete = ArrayUtils.addAll(complete, PLUS);
            }
            if(letter == '-') {
                complete = ArrayUtils.addAll(complete, MINUS);
            }
            if(letter == '_') {
                complete = ArrayUtils.addAll(complete, UNDERSCORE);
            }
            if(letter == '"') {
                complete = ArrayUtils.addAll(complete, QUOTATION);
            }
            if(letter == '$') {
                complete = ArrayUtils.addAll(complete, DOLLAR);
            }
            if(letter == '@') {
                complete = ArrayUtils.addAll(complete, AT);
            }
            if(letter == ' ') {
                complete = ArrayUtils.addAll(complete, BETWEEN_WORDS);
            }
            if(i < word.length() - 1) {
                if (!(word.charAt(i + 1) == ' ') && letter != ' ') {
                    complete = ArrayUtils.addAll(complete, BETWEEN_LETTERS);
                }
            }
        }
        return complete;
    }

}
