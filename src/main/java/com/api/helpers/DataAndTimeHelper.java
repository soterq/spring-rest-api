package com.api.helpers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataAndTimeHelper {
    public static LocalDateTime getCurrentDataAndTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return now;
    }
}
