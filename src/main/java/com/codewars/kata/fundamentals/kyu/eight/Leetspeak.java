package com.codewars.kata.fundamentals.kyu.eight;

/**
 * Created by Nick on 30.05.2015.
 */
public class Leetspeak extends Encoder {

    @Override
    public String encode(String source) {
        // TODO - Encode the source string into a 133tSp34k string
        String returnEncodedString = "";
        if(source != null) {
            for (int i = 0, j = 1; i < source.length(); i++, j++) {
                if (Dictionary.hasLiteral(source.substring(i, j).toLowerCase())) {
                    returnEncodedString += Dictionary.valueOf(source.substring(i, j).toLowerCase()).getLeetLiteral();
                } else {
                    returnEncodedString += source.substring(i, j);
                }
            }
        }
        return returnEncodedString;
    }

}

abstract class Encoder {
    protected enum Dictionary {
        a("a", "4"),
        e("e", "3"),
        l("l", "1"),
        m("m", "/^^\\"),
        o("o", "0"),
        u("u", "(_)");

        private final String literal, leetLiteral;

        Dictionary(String literal, String leetLiteral) {
            this.literal = literal;
            this.leetLiteral = leetLiteral;
        }

        public String getLiteral() {
            return literal;
        }

        public String getLeetLiteral() {
            return leetLiteral;
        }

        public static boolean hasLiteral(String literal) {
            boolean returnValue = false;
            for (Dictionary dictionary : Dictionary.values()) {
                if (literal.equals(dictionary.getLiteral())) {
                    returnValue = true;
                }
            }
            return returnValue;
        }
    }

    public abstract String encode(String source);
}