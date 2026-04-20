package pages.components;

import com.github.javafaker.Faker;
import pages.PracticeForm;

import java.util.Locale;

public class FakerComponent {
    Faker faker = new Faker();
    Faker fakerRu = new Faker(new Locale("ru"));

    public String generateFirstName() {return fakerRu.name().firstName();}

    public String generateLastName() {return fakerRu.name().lastName();}

    public String generateEmail() {return faker.internet().emailAddress();}

    public String generatePhoneNumber() {return faker.numerify("##########");}

    public String generateCurrentAddress() {return fakerRu.address().fullAddress();}

    public String generateGender() {return faker.options().option("Male", "Female", "Other");}

    public String generateDay() {return String.valueOf(faker.number().numberBetween(1, 29));}

    public String generateMonth() {return faker.options().option("January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December");}

    public String generateYear() {return String.valueOf(faker.number().numberBetween(1998, 2025));}

    public String generateState() {return faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");}

    public String generateCity(String state) {
        if (state.equals("NCR")) {
            return faker.options().option("Delhi", "Gurgaon", "Noida");
        }
        if (state.equals("Uttar Pradesh")) {
            return faker.options().option("Agra", "Lucknow", "Merrut");
        }
        if (state.equals("Haryana")) {
            return faker.options().option("Karnal", "Panipat");
        }
        if (state.equals("Rajasthan")) {
            return faker.options().option("Jaipur", "Jaselmer");
        }
        return "";
    }

    public String generateLanguage() {
        return faker.options().option("English", "Chemistry", "Arts", "Maths", "Biology",
                "Hindi", "Physics", "Accounting");
    }

    public String generateHobby() {
        return faker.options().option("Sports", "Reading", "Music");
    }
}
