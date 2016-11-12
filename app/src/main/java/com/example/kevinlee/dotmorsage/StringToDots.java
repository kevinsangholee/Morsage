package com.example.kevinlee.dotmorsage;

public class StringToDots {
    private static final String A = ".-";
    private static final String B = "-...";
    private static final String C = "-.-.";
    private static final String D = "-..";
    private static final String E = ".";
    private static final String F = "..-.";
    private static final String G = "--.";
    private static final String H = "....";
    private static final String I = "..";
    private static final String J = ".---";
    private static final String K = "-.-";
    private static final String L = ".-..";
    private static final String M = "--";
    private static final String N = "-.";
    private static final String O = "---";
    private static final String P = ".--.";
    private static final String Q = "--.-";
    private static final String R = ".-.";
    private static final String S = "...";
    private static final String T = "-";
    private static final String U = "..-";
    private static final String V = "...-";
    private static final String W = ".--";
    private static final String X = "-..-";
    private static final String Y = "-.--";
    private static final String Z = "--..";
    private static final String ONE = ".----";
    private static final String TWO = "..---";
    private static final String THREE = "...--";
    private static final String FOUR = "....-";
    private static final String FIVE = ".....";
    private static final String SIX = "-....";
    private static final String SEVEN = "--...";
    private static final String EIGHT = "---..";
    private static final String NINE = "----.";
    private static final String ZERO = "-----";
    private static final String SPACE = "/";
    private static final String QUESTION = "..--..";
    private static final String APOSTROPHE = ".----.";
    private static final String EXCLAMATION = "-.-.--";
    private static final String SLASH = "-..-.";
    private static final String CLOSE_PARENTHESES = "-.--.-";
    private static final String OPEN_PARENTHESES = "-.--.";
    private static final String AMPERSAND = ".-...";
    private static final String COLON = "---...";
    private static final String SEMICOLON = "-.-.-.";
    private static final String EQUALS = "-...-";
    private static final String PLUS = ".-.-.";
    private static final String MINUS = "-....-";
    private static final String UNDERSCORE = "..--.-";
    private static final String QUOTATION = ".-..-.";
    private static final String DOLLAR = "...-..-";
    private static final String AT = ".--.-.";

    private static String mainString;


    public StringToDots(String mainString) {
        this.mainString = mainString;

    }

    public static String turnItIntoDots() {
        String returnString = "";
        for(int i = 0; i < mainString.length(); i++) {
            if(mainString.charAt(i) == 'a' || mainString.charAt(i) == 'A') {
                returnString += A;
            }
            if(mainString.charAt(i) == 'b' || mainString.charAt(i) == 'B') {
                returnString += B;
            }
            if(mainString.charAt(i) == 'c' || mainString.charAt(i) == 'C') {
                returnString += C;
            }
            if(mainString.charAt(i) == 'd' || mainString.charAt(i) == 'D') {
                returnString += D;
            }
            if(mainString.charAt(i) == 'e' || mainString.charAt(i) == 'E') {
                returnString += E;
            }
            if(mainString.charAt(i) == 'f' || mainString.charAt(i) == 'F') {
                returnString += F;
            }
            if(mainString.charAt(i) == 'g' || mainString.charAt(i) == 'G') {
                returnString += G;
            }
            if(mainString.charAt(i) == 'h' || mainString.charAt(i) == 'H') {
                returnString += H;
            }
            if(mainString.charAt(i) == 'i' || mainString.charAt(i) == 'I') {
                returnString += I;
            }
            if(mainString.charAt(i) == 'j' || mainString.charAt(i) == 'J') {
                returnString += J;
            }
            if(mainString.charAt(i) == 'K' || mainString.charAt(i) == 'k') {
                returnString += K;
            }
            if(mainString.charAt(i) == 'L' || mainString.charAt(i) == 'l') {
                returnString += L;
            }
            if(mainString.charAt(i) == 'M' || mainString.charAt(i) == 'm') {
                returnString += M;
            }
            if(mainString.charAt(i) == 'N' || mainString.charAt(i) == 'n') {
                returnString += N;
            }
            if(mainString.charAt(i) == 'O' || mainString.charAt(i) == 'o') {
                returnString += O;
            }
            if(mainString.charAt(i) == 'P' || mainString.charAt(i) == 'p') {
                returnString += P;
            }
            if(mainString.charAt(i) == 'Q' || mainString.charAt(i) == 'q') {
                returnString += Q;
            }
            if(mainString.charAt(i) == 'r' || mainString.charAt(i) == 'R') {
                returnString += R;
            }
            if(mainString.charAt(i) == 's' || mainString.charAt(i) == 'S') {
                returnString += S;
            }
            if(mainString.charAt(i) == 'T' || mainString.charAt(i) == 't') {
                returnString += T;
            }
            if(mainString.charAt(i) == 'u' || mainString.charAt(i) == 'U') {
                returnString += U;
            }
            if(mainString.charAt(i) == 'v' || mainString.charAt(i) == 'V') {
                returnString += V;
            }
            if(mainString.charAt(i) == 'w' || mainString.charAt(i) == 'W') {
                returnString += W;
            }
            if(mainString.charAt(i) == 'x' || mainString.charAt(i) == 'X') {
                returnString += X;
            }
            if(mainString.charAt(i) == 'Y' || mainString.charAt(i) == 'y') {
                returnString += Y;
            }
            if(mainString.charAt(i) == 'Z' || mainString.charAt(i) == 'z') {
                returnString += Z;
            }
            if(mainString.charAt(i) == '1') {
                returnString += ONE;
            }
            if(mainString.charAt(i) == '2') {
                returnString += TWO;
            }
            if(mainString.charAt(i) == '3') {
                returnString += THREE;
            }
            if(mainString.charAt(i) == '4') {
                returnString += FOUR;
            }
            if(mainString.charAt(i) == '5') {
                returnString += FIVE;
            }
            if(mainString.charAt(i) == '6') {
                returnString += SIX;
            }
            if(mainString.charAt(i) == '7') {
                returnString += SEVEN;
            }
            if(mainString.charAt(i) == '8') {
                returnString += EIGHT;
            }
            if(mainString.charAt(i) == '9') {
                returnString += NINE;
            }
            if(mainString.charAt(i) == '0') {
                returnString += ZERO;
            }
            if(mainString.charAt(i) == ' ') {
                returnString += SPACE;
            }
            if(mainString.charAt(i) == '?') {
                returnString += QUESTION;
            }
            if(mainString.charAt(i) == 39) {
                returnString += APOSTROPHE;
            }
            if(mainString.charAt(i) == '!') {
                returnString += EXCLAMATION;
            }
            if(mainString.charAt(i) == '/') {
                returnString += SLASH;
            }
            if(mainString.charAt(i) == ')') {
                returnString += CLOSE_PARENTHESES;
            }
            if(mainString.charAt(i) == '(') {
                returnString += OPEN_PARENTHESES;
            }
            if(mainString.charAt(i) == '&') {
                returnString += AMPERSAND;
            }
            if(mainString.charAt(i) == ':') {
                returnString += COLON;
            }
            if(mainString.charAt(i) == ';') {
                returnString += SEMICOLON;
            }
            if(mainString.charAt(i) == '=') {
                returnString += EQUALS;
            }
            if(mainString.charAt(i) == '+') {
                returnString += PLUS;
            }
            if(mainString.charAt(i) == '-') {
                returnString += MINUS;
            }
            if(mainString.charAt(i) == '_') {
                returnString += UNDERSCORE;
            }
            if(mainString.charAt(i) == '"') {
                returnString += QUOTATION;
            }
            if(mainString.charAt(i) == '$') {
                returnString += DOLLAR;
            }
            if(mainString.charAt(i) == '@') {
                returnString += AT;
            }

            returnString += " ";
        }
        return returnString;
    }
    public String turnItIntoWords() {
        String finalString = "";
        int count = 0;
        if(mainString.indexOf(' ') == -1 && mainString.indexOf('/') == -1)
            mainString += " ";
        for(int i = 0; i < mainString.length(); i++) {
            if(mainString.charAt(i) == ' ' || mainString.charAt(i) == '/')
                count++;
        }
        int[] wordEnd = new int[count];
        char[] wordEndType = new char[count];
        int index = 0;
        for(int m = 0; m < mainString.length(); m++) {
            if(mainString.charAt(m) == ' ' || mainString.charAt(m) == '/') {
                wordEnd[index] = m;
                wordEndType[index] = mainString.charAt(m);
                index++;
            }
        }
        for(int n = 0; n < wordEnd.length; n++) {
            if(n == 0) {
                String midString = mainString.substring(n, wordEnd[n]);
                finalString += checkMorse(midString);

                if(wordEndType[0] == '/') {
                    finalString = finalString + " ";

                }
            }
            else if(n < wordEnd.length - 1){
                String midString = mainString.substring(wordEnd[n - 1] + 1, wordEnd[n]);
                finalString += checkMorse(midString);
                if(wordEndType[n] == '/') {
                    finalString += " ";
                }

            }
            else {
                String midString = mainString.substring(wordEnd[n-1] + 1, wordEnd[n]);
                finalString += checkMorse(midString);
                if(wordEndType[n] == '/') {
                    finalString += " ";
                }

                midString = mainString.substring(wordEnd[n] + 1, mainString.length());
                finalString += checkMorse(midString);
                if(wordEndType[n] == '/') {
                    finalString += " ";
                }
            }
        }
        return finalString;
    }
    public String checkMorse(String intermediateString) {
        String returnString = "";
        if(intermediateString.equals(A)) {
            returnString += 'a';
        }
        if(intermediateString.equals(B)) {
            returnString += 'b';
        }
        if(intermediateString.equals(C)) {
            returnString += 'c';
        }
        if(intermediateString.equals(D)) {
            returnString += 'd';
        }
        if(intermediateString.equals(E)) {
            returnString += 'e';
        }
        if(intermediateString.equals(F)) {
            returnString += 'f';
        }
        if(intermediateString.equals(G)) {
            returnString += 'g';
        }
        if(intermediateString.equals(H)) {
            returnString += 'h';
        }
        if(intermediateString.equals(I)) {
            returnString += 'i';
        }
        if(intermediateString.equals(J)) {
            returnString += 'j';
        }
        if(intermediateString.equals(K)) {
            returnString += 'k';
        }
        if(intermediateString.equals(L)) {
            returnString += 'l';
        }
        if(intermediateString.equals(M)) {
            returnString += 'm';
        }
        if(intermediateString.equals(N)) {
            returnString += 'n';
        }
        if(intermediateString.equals(O)) {
            returnString += 'o';
        }
        if(intermediateString.equals(P)) {
            returnString += 'p';
        }
        if(intermediateString.equals(Q)) {
            returnString += 'q';
        }
        if(intermediateString.equals(R)) {
            returnString += 'r';
        }
        if(intermediateString.equals(S)) {
            returnString += 's';
        }
        if(intermediateString.equals(T)) {
            returnString += 't';
        }
        if(intermediateString.equals(U)) {
            returnString += 'u';
        }
        if(intermediateString.equals(V)) {
            returnString += 'v';
        }
        if(intermediateString.equals(W)) {
            returnString += 'w';
        }
        if(intermediateString.equals(X)) {
            returnString += 'x';
        }
        if(intermediateString.equals(Y)) {
            returnString += 'y';
        }
        if(intermediateString.equals(Z)) {
            returnString += 'z';
        }
        if(intermediateString.equals(ONE)) {
            returnString += '1';
        }
        if(intermediateString.equals(TWO)) {
            returnString += '2';
        }
        if(intermediateString.equals(THREE)) {
            returnString += '3';
        }
        if(intermediateString.equals(FOUR)) {
            returnString += '4';
        }
        if(intermediateString.equals(FIVE)) {
            returnString += '5';
        }
        if(intermediateString.equals(SIX)) {
            returnString += '6';
        }
        if(intermediateString.equals(SEVEN)) {
            returnString += '7';
        }
        if(intermediateString.equals(EIGHT)) {
            returnString += '8';
        }
        if(intermediateString.equals(NINE)) {
            returnString += '9';
        }
        if(intermediateString.equals(ZERO)) {
            returnString += '0';
        }
        if(intermediateString.equals(QUESTION)) {
            returnString += '?';
        }
        if(intermediateString.equals(APOSTROPHE)) {
            char c = 39;
            returnString += c;
        }
        if(intermediateString.equals(EXCLAMATION)) {
            returnString += '!';
        }
        if(intermediateString.equals(SLASH)) {
            returnString += '/';
        }
        if(intermediateString.equals(CLOSE_PARENTHESES)) {
            returnString += ')';
        }
        if(intermediateString.equals(OPEN_PARENTHESES)) {
            returnString += '(';
        }
        if(intermediateString.equals(AMPERSAND)) {
            returnString += '&';
        }
        if(intermediateString.equals(COLON)) {
            returnString += ':';
        }
        if(intermediateString.equals(SEMICOLON)) {
            returnString += ';';
        }
        if(intermediateString.equals(EQUALS)) {
            returnString += '=';
        }
        if(intermediateString.equals(PLUS)) {
            returnString += '+';
        }
        if(intermediateString.equals(MINUS)) {
            returnString += '-';
        }
        if(intermediateString.equals(UNDERSCORE)) {
            returnString += '_';
        }
        if(intermediateString.equals(QUOTATION)) {
            returnString += '"';
        }
        if(intermediateString.equals(DOLLAR)) {
            returnString += '$';
        }
        if(intermediateString.equals(AT)) {
            returnString += '@';
        }

        return returnString;
    }
}