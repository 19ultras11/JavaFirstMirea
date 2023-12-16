package ru.mirea.task7.number5;

public class Tester {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulatorImpl();

        String s = "Hello, World!";
        int characterCount = manipulator.countCharacters(s);
        String oddCharacters = manipulator.getOddCharacters(s);
        String reversedString = manipulator.reverseString(s);

        System.out.println("Character count: " + characterCount);
        System.out.println("Odd characters: " + oddCharacters);
        System.out.println("Reversed string: " + reversedString);
    }

}