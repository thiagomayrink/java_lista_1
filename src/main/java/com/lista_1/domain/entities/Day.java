package com.lista_1.domain.entities;

public class Day {
    private boolean isHolliday;
    private String hollidayName;
    private String date;

    public Day(String date) {
        this.date = date;
        this.isHolliday = false;
        this.hollidayName = "";
    }

    public Day(String date, boolean isHolliday, String hollidayName) {
        this.date = date;
        this.isHolliday = isHolliday;
        this.hollidayName = hollidayName;
    }
    
    public String isHolliday() {
        if(this.isHolliday){
            return "Dia " + this.date + " é " + this.hollidayName + " 🎉";
        } else {
            return "Dia " + this.date + " não é feriado 🥲";
        }
    }

    public String getValue() {
        return this.date;
    }
    public void setValue(String date) {
        this.date = date;
    }
    public void setIsHolliday(boolean isHolliday) {
        this.isHolliday = isHolliday;
    }
    public boolean getIsHolliday() {
        return this.isHolliday;
    }
    public String getHollidayName() {
        return this.hollidayName;
    }
    public void setHollidayName(String hollidayName) {
        this.hollidayName = hollidayName;
    }
}
