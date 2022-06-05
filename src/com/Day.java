package com;

public enum Day {
    MONDAY("Дуйшомбу"),
    TUESDAY("Шейшемби"),
    WEDNESDAY("Шаршемби"),
    THURSDAY("Бейшемби"),
    FRIDAY("Жума"),
    SATURDAY("Ишемби"),
    SUNDAY("Жекшемби");

    private String translation;
    Day(String translation1) {
        translation = translation1;
    }

    @Override
    public String toString() {
        return  translation;
    }
}


