package com.teachmeskills.lesson_12;

public class Validator {

    public static String checkNumDoc(String str) {
        String infoNumb = "";

        if (str.length() != 15) {
            infoNumb = "Длина номера документа должна быть 15 символов";
        } else if (!((str.contains("docnum")) || (str.contains("сontract")))) {
            infoNumb = "Номер документа не содержит docnum или сontract";
        } else {
            infoNumb = "Валидный";
        }

        return infoNumb;
    }

}
