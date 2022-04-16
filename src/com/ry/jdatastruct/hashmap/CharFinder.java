package com.ry.jdatastruct.hashmap;

import java.security.PublicKey;
import java.util.*;

public class CharFinder {

    /**
     * my way to find the first non repeating char
     * @param item
     * @return
     */
    public String  findFirstNonRepeatingCharMyWay(String item){
        String it = "";
        Map<String, Integer> map = new HashMap<>();
        Integer number;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < item.length(); i++){
            it = String.valueOf(item.charAt(i));
            if (map.containsKey(it)){
                number = map.get(it);
                map.put(it,number = number + 1);
            }else {
                map.put(it, 1);
            }
        }
        for (var ch : map.keySet()){
            var value = map.get(ch);
            if (value == 1){
                arrayList.add(ch);
            }
        }
        it = (String) arrayList.get(0);
        return it;
    }

    public char findFirstNonRepeatingChar(String str){
        Map<Character, Integer> map = new HashMap<>();

        var chars = str.toCharArray();
        for (var ch : str.toCharArray()){
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
//            if (map.containsKey(ch)){
//                var count = map.get(ch);
//                map.put(ch, count);
//            }else {
//                map.put(ch, 1);
//            }
        }
        for (var ch : chars){
            if (map.get(ch) == 1){
                return ch;
            }
        }
        return Character.MIN_VALUE;
    }

    public char findFirstRepeatedChar(String str){
        Set<Character> set = new HashSet<>();
        for (var ch : str.toCharArray()){
            if (set.contains(ch)){
                return ch;
            }else {
                set.add(ch);
            }
        }
        return Character.MIN_VALUE;
    }
}
