package com.bzh.bigdata;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestLocalDateTime {

    @Test
    public void testDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatTime = dateTimeFormatter.format(localDateTime);
        System.out.println(formatTime);
    }
}
