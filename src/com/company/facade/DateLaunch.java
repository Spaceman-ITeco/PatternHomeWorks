package com.company.facade;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateLaunch {
    public static void main(String[] args) {
        Date date = new Date();
        DateConvertionFacade dateConvertionFacade = new DateConvertionFacade();
        LocalDate localDate = dateConvertionFacade.convertToLocalDateViaInstant(date);
        LocalDateTime localDateTime=dateConvertionFacade.convertToLocalDateTimeViaInstant(date);

        System.out.println(localDate);
        System.out.println(localDateTime);

    }
}
