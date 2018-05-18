package com.notionquest;

import java.util.Arrays;

public class Solution {
    public String solution(String S) {
        int[] occurrences = new int[26];
        for (char ch : S.toCharArray()) {
            occurrences[ch - 'a']++;
        }

        char best_char = 'a';
        int  best_res  = 0;

        int maxInt = Arrays.stream(occurrences).max().getAsInt();
        for (int i = 0; i < 26; i++) {
            if (occurrences[i] == maxInt) {
                best_char = (char)((int)'a' + i);
                best_res  = occurrences[i];
                break;
            }
        }

        return Character.toString(best_char);
    }

}
