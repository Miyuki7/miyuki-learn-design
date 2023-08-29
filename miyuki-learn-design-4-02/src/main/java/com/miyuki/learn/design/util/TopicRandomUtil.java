package com.miyuki.learn.design.util;

import java.util.*;

/**
 * @author: miyuki
 * @description: 选择题乱序工具类
 * @date: 2023/8/29 23:28
 * @version: 1.0
 */
public class TopicRandomUtil {

    static public Topic ramdom(Map<String, String> option, String key) {
        Set<String> keySet = option.keySet(); // a b c d    b
        ArrayList<String> keyList = new ArrayList<>(keySet);
        Collections.shuffle(keyList);// c d a b
        HashMap<String, String> optionNew = new HashMap<>();
        int idx = 0;
        String keyNew = "";
        //next a b c d
        //rand c d a b
        for (String next : keySet) {
            String randomKey = keyList.get(idx++);
            if (key.equals(next)) {
                keyNew = randomKey; // d
            }
            optionNew.put(randomKey, option.get(next));
        }
        return new Topic(optionNew, keyNew);
    }
}
