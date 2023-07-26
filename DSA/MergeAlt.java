package Leetcode;

import javax.lang.model.type.NullType;

public class MergeAlt {
    public static void main(String[] args) {
        String w1 = "abc";
        String w2 = "pqr";
        System.out.println(mergeAlternately(w1, w2));
    }

    static String mergeAlternately(String word1, String word2) {
        String ans = "";
                StringBuilder result = new StringBuilder();
                int i = 0;
                while (i < word1.length() || i < word2.length()) {
                    if (i < word1.length()) {
                        result.append(word1.charAt(i));
                    }
                    if (i < word2.length()) {
                        result.append(word2.charAt(i));
                    }
                    i++;
                }
                return result.toString();
            }
        }
