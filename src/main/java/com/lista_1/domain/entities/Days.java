package com.lista_1.domain.entities;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Days {
    private Map<String,Day> hollydaysMap = new HashMap<>();

    public Days (Day[] daysList) {
        for(int i=0; i < daysList.length; i++) {
            this.hollydaysMap.put(daysList[i].getValue(), daysList[i]);
        }
    }
    public Days () {
        this.hollydaysMap.put("01-01-2024", new Day("01-01-2024", true, "Confraternização Mundial"));
        this.hollydaysMap.put("12-02-2024", new Day("12-02-2024", true, "Carnaval"));
        this.hollydaysMap.put("13-02-2024", new Day("13-02-2024", true, "Carnaval"));
        this.hollydaysMap.put("29-03-2024", new Day("29-03-2024", true, "Sexta-feira Santa"));
        this.hollydaysMap.put("21-04-2024", new Day("21-04-2024", true, "Tiradentes"));
        this.hollydaysMap.put("01-05-2024", new Day("01-05-2024", true, "Dia do Trabalho"));
        this.hollydaysMap.put("30-05-2024", new Day("30-05-2024", true, "Corpus Christi"));
        this.hollydaysMap.put("07-09-2024", new Day("07-09-2024", true, "Independência do Brasil"));
        this.hollydaysMap.put("12-10-2024", new Day("12-10-2024", true, "Nossa Senhora Aparecida"));
        this.hollydaysMap.put("02-11-2024", new Day("02-11-2024", true, "Finados"));
        this.hollydaysMap.put("15-11-2024", new Day("15-11-2024", true, "Proclamação da República"));
        this.hollydaysMap.put("20-11-2024", new Day("20-11-2024", true, "Dia Nacional de Zumbi e da Consciência Negra"));
        this.hollydaysMap.put("25-12-2024", new Day("25-12-2024", true, "Natal"));
    }

    public Collection<Day> getHollidays() {
        return this.hollydaysMap.values();
    }

    public String isHolliday(String date) {
        if (!this.hollydaysMap.containsKey(date)) return new Day(date).isHolliday();
        return this.hollydaysMap.get(date).isHolliday();
    }

    public Day getDay(String date) {
        return this.hollydaysMap.get(date);
    }
    public void setDay(Day day) {
        this.hollydaysMap.put(day.getValue(), day);
    }
}
