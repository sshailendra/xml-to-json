package com.dataformat.adapter;

import javax.swing.text.DateFormatter;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeAdapter extends XmlAdapter<String, Integer> {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

    @Override
    public String marshal(Integer dateTime) {
        return null;
    }

    @Override
    public Integer unmarshal(String dateTime) {
        LocalDate localdate=  LocalDate.parse(dateTime, formatter);

        return Period.between(LocalDate.from(localdate), LocalDate.now()).getYears();
    }

}

