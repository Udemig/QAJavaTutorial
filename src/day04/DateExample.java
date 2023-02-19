package day04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateExample {

    void showDate(){
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate: " + localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime: "+ localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime: "+ localDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String newLocalDateTime = localDateTime.format(dateTimeFormatter);
        System.out.println("newLocalDateTime: "+ newLocalDateTime);


    }
}
