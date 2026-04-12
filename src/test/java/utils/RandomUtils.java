package utils;

import java.security.SecureRandom;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.String.format;

public class RandomUtils {
    public static void main(String[] args) {
        System.out.println(getRandomString(8));
        System.out.println(getRandomEmail());
    }

    // Генерация  значения для Имени и фамилии
    public static String getRandomString(int lenght) {
        String lettersWithNumber = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
/ /String Letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        SecureRandom rnd = new SecureRandom();
        for (int i = 0; i < lenght; i++) {
            result.append(lettersWithNumber.charAt(rnd.nextInt(lettersWithNumber.length())));
        }
        return result.toString();

    }

    //    Генерация значения для email
    public static String getRandomEmail() {
//        return getRandomString(3)+"@"+getRandomString(3)+".com";
//        return String.format("%s@%s.com");
//        return format("%s@%s.com",getRandomString(3),getRandomString(3));
        String emailDomain = "@inbox.ru";
        return getRandomString(10) + emailDomain;

    }

    //Генерация Случайного числа. Нужно далее для номера.
    public static int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
//    SecureRandom rnd = new SecureRandom();
//    return rnd.nextInt(max + 1);
    }

    // Генерация случайных чисел и подгон их под формат номера телефона
    public static String getRandomPhone() {
        String phoneTemplate = "%s%s%s%s%s";
        return format(phoneTemplate,
                getRandomInt(1, 9),
                getRandomInt(111, 999),
                getRandomInt(111, 999), getRandomInt(11, 99),
                getRandomInt(11, 99));
    }

    //Установка случайного значения гендера Плохой вариант.
//    public static String getRandomGender(){
//        String [] genders = {"Male", "Female","Other"};
//        int randomIdex = getRandomInt(0,2);
//       return genders[randomIdex];
//    }
    // Хороший варинт работы с массивом.
    public static String getRandomGender() {
        String[] genders = {"Male", "Female", "Other"}; // тут показываем, из чего выбирать.
        return getRandomItemFromStringArray(genders);
    }

    public static String getRandomItemFromStringArray(String[] stringsArray) { // Здесь спрашивает ЧТО рандомизировать.
        int arrayLenght = stringsArray.length; // Здесь определяет, из скольки эдлементов ему выбирать
        int randomIdex = getRandomInt(0, arrayLenght - 1); // Здесь указывает-решает на элемент, который хочет выбрать.
        return stringsArray[randomIdex]; // Здесь возвращает то, что он выбрал.
    }

    //ВЫбор случайного Subject
    public static String getRandomSubject() {
        String[] subject = {"English", "Chemistry", "Arts", "Maths", "Biology", "Hindi", "Physics", "Accounting"};
        return getRandomItemFromStringSubject(subject);
    }

    public static String getRandomItemFromStringSubject(String[] stringsArray) {
        int arrayLenght = stringsArray.length;
        int randomIdex = getRandomInt(0, arrayLenght - 7);
        return stringsArray[randomIdex];
    }

    //ВЫбор случайного Хобби
    public static String getRandomHobbies() {
        String[] hobbies = {"Sports", "Reading", "Music"};
        return getRandomItemFromStringHobbies(hobbies);
    }

    public static String getRandomItemFromStringHobbies(String[] stringsArray) {
        int arrayLenght = stringsArray.length;
        int randomIdex = getRandomInt(0, arrayLenght - 1);
        return stringsArray[randomIdex];
    }
}

public static String getRandomState() {
    String[] state = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};
    return getRandomItemFromStringArrayState(state);
}

public static String getRandomItemFromStringArrayState(String[] stringsArray) {
    int arrayLenght = stringsArray.length;
    int randomIdex = RandomUtils.getRandomInt(0, arrayLenght - 4);
    return stringsArray[randomIdex];
}
//
//    public static String getRandomSity() {
//        String state = getRandomState();
//        String[] city = {
//        if (Objects.equals(state, "NCR")){
//            return RandomUtils.getRandomItemFromStringArray(//сюда в { } перечисляем города)
//        }
//        if (Objects.equals(state, "Uttar Pradesh")){
//        }
//    }

    }

