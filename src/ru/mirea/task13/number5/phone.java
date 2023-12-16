package ru.mirea.task13.number5;

public class phone {
    public static String formatPhoneNumber(String phoneNumber) {
        phoneNumber = phoneNumber.replace(" ", "").replace("-", "");

        if (phoneNumber.startsWith("+")) {
            if (phoneNumber.length() == 12) {
                String countryCode = phoneNumber.substring(1, 4);
                String areaCode = phoneNumber.substring(4, 7);
                String localNumber = phoneNumber.substring(7);
                return "+" + countryCode + areaCode + "-" + localNumber.substring(0, 3) + "-" + localNumber.substring(3);
            } else {
                return "Некорректный номер";
            }
        } else if (phoneNumber.startsWith("8") && phoneNumber.length() == 11) {
            String localNumber = phoneNumber.substring(1);
            return "+7" + localNumber.substring(0, 3) + "-" + localNumber.substring(3, 6) + "-" + localNumber.substring(6);
        } else {
            return "Некорректный номер";
        }
    }

    public static void main(String[] args) {
        String phoneNumber1 = "+78005553535";
        String phoneNumber2 = "88005553535";
        String phoneNumber3 = "+775856764585";
        String phoneNumber4 = "81234567890";

        System.out.println("Formatted: " + formatPhoneNumber(phoneNumber1));
        System.out.println("Formatted: " + formatPhoneNumber(phoneNumber2));
        System.out.println("Formatted: " + formatPhoneNumber(phoneNumber3));
        System.out.println("Formatted: " + formatPhoneNumber(phoneNumber4));
    }
}