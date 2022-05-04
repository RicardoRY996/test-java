package com.ry.jdatastruct;

import java.util.*;

public class StringUtils {
    public static int countVowels(String str){
        if (str == null){
            return 0;
        }

        int count = 0;
        String vowels = "aeiou";
        for (var ch : str.toLowerCase().toCharArray()){
            if (vowels.indexOf(ch) != -1){
                count++;
            }
        }
        return count;
    }

    public static String reverse(String str){
        if (str == null){
            return "";
        }

        StringBuilder reversed = new StringBuilder();
        for (var i = str.length() - 1; i >= 0; i--){
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static String reverseWords(String sentence){
        if (sentence == null){
            return "";
        }
        String[] words = sentence.trim().split(" ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);


//        StringBuilder reversed = new StringBuilder();
//        for (var i = words.length - 1; i >= 0; i--){
//            reversed.append(words[i] + " ");
//        }
//        return reversed.toString().trim();
    }

    public static boolean areRotations(
            String strOne, String strTwo){
        if (strOne == null || strTwo == null){
            return false;
        }
        return (strOne.length() == strTwo.length() &&
                (strOne + strOne).contains(strTwo));

    }

    public static String removeDuplicates(String str){
        if (str == null){
            return "";
        }

        StringBuilder output = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for (var ch : str.toCharArray()){
            if (seen.contains(ch)){
                seen.add(ch);
                output.append(ch);
            }
        }
        return output.toString();
    }

    public static char getMaxOccuringChar(String str){
//        Map<Character, Integer> frequencies = new HashMap<>();
//        for (var ch : str.toCharArray()){
//            if (frequencies.containsKey(ch)){
//                frequencies.replace(ch, frequencies.get(ch) + 1);
//            }else {
//                frequencies.put(ch, 1);
//            }
//        }
        final int ASCII_SIZE = 256;
        int[] frequencies = new int[ASCII_SIZE];
        for (var ch : str.toCharArray()){
            frequencies[ch]++;
        }
        int max = 0;
        char result = ' ';
        for (var i = 0; i < frequencies.length; i++){
            if (frequencies[i] > max){
                max = frequencies[i];
                result = (char) i;

            }
        }
        return result;
    }

    public static String capitalize(String sentence){
        if (sentence == null || sentence.trim().isEmpty()){
            return "";
        }

        String[] words = sentence
                            .trim()
                            .replaceAll(" +", " ")
                            .split(" ");
        for (var i = 0; i < words.length; i++){
            words[i] = words[i].substring(0, 1).toUpperCase()
                    + words[i].substring(1).toLowerCase();
        }

        return String.join(" ", words);
    }

    public static boolean areAnagrams(String first, String second){
        if (first == null || second == null ||
                first.length() != second.length()){
            return false;
        }
        var arrayOne = first.toLowerCase().toCharArray();
        Arrays.sort(arrayOne);

        var arrayTwo = second.toLowerCase().toCharArray();
        Arrays.sort(arrayTwo);

        return Arrays.equals(arrayOne, arrayTwo);
    }

    public static boolean areAnagramOtherWay(String first, String second){
        final int ENGLISH_ALPHABET = 26;
        int[] frequencies = new int[ENGLISH_ALPHABET];

        if (first == null || second == null){
            return false;
        }
        first = first.toLowerCase();
        for (var i = 0; i < first.length(); i++){
            var index = first.charAt(i) - 'a';
            frequencies[index] = frequencies[index] + 1;
        }
        second = second.toLowerCase();
        for (var i = 0; i < second.length(); i++){
            var index = second.charAt(i) - 'a';
            if (frequencies[index] == 0){
                return false;
            }
            frequencies[index] = frequencies[index] - 1;
        }
        return true;
    }

    public static boolean isPalindrome(String word){
        if (word == null){
            return false;
        }
        int left = 0;
        int right = word.length() - 1;

        while (left < right){
            if (word.charAt(left++) != word.charAt(right--)){
                return false;
            }
        }
        return true;
    }

}
