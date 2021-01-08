package com.bzh.bigdata;

import org.junit.Test;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestMap {

    @Test
    public void testLinkedHashMap() {

        Map<String, String> map = new LinkedHashMap<>();
        map.put("c", "lucy");
        map.put("b", "tom");
        map.put("a", "lee");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            System.out.println("key: " + next.getKey() + "\tvalue: " + next.getValue());
        }
    }
}
