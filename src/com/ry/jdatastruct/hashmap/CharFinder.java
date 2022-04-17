package com.ry.jdatastruct.hashmap;

import java.util.*;

public class CharFinder {

    /**
     * my way to find the first non repeating char
     * 此方法可以用于找到第一次不重复的字符，
     * 改后也可找到第一次重复的字符
     * 不必更改数据结构
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
