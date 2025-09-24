package com.celestial.tokeniser;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StringTokeniser1 {
    public String[] tokenise(String input) {
        if (input == null || input.isEmpty()) {
            return new String[0];
        }
        return input.split(",");
    }
}
