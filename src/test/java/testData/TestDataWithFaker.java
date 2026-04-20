package testData;

import pages.components.FakerComponent;

public class TestDataWithFaker {


    private final String firstNameFaker;
    private final String lastNameFaker;
    private final String userNumberFaker;
    private final String userEmailFaker;
    private final String genderFaker;
    private final String languageFaker;
    private final String hobbiesFaker;
    private final String currentAddressFaker;
    private final String stateFaker;
    private final String cityFaker;
    private final String monthFaker;
    private final String yearFaker;
    private final String dayFaker;


    public TestDataWithFaker() {
        FakerComponent fakerComponent = new FakerComponent();


        this.firstNameFaker = fakerComponent.generateFirstName();
        this.lastNameFaker = fakerComponent.generateLastName();
        this.userEmailFaker = fakerComponent.generateEmail();
        this.userNumberFaker = fakerComponent.generatePhoneNumber();
        this.genderFaker = fakerComponent.generateGender();
        this.languageFaker = fakerComponent.generateLanguage();
        this.hobbiesFaker = fakerComponent.generateHobby();
        this.currentAddressFaker = fakerComponent.generateCurrentAddress();
        this.stateFaker = fakerComponent.generateState();
        this.cityFaker = fakerComponent.generateCity(this.stateFaker);
        this.monthFaker = fakerComponent.generateMonth();
        this.yearFaker = fakerComponent.generateYear();
        this.dayFaker = fakerComponent.generateDay();
    }

    public String getFirstNameFaker() {return firstNameFaker;}

    public String getLastNameFaker() {return lastNameFaker;}

    public String getUserNumberFaker() {return userNumberFaker;}

    public String getUserEmailFaker() {return userEmailFaker;}

    public String getGenderFaker() {return genderFaker;}

    public String getLanguageFaker() {return languageFaker;}

    public String getHobbiesFaker() {return hobbiesFaker;}

    public String getCurrentAddressFaker() {return currentAddressFaker;}

    public String getStateFaker() {return stateFaker;}

    public String getCityFaker() {return cityFaker;}

    public String getMonthFaker() {return monthFaker;}

    public String getYearFaker() {return yearFaker;}

    public String getDayFaker() {return dayFaker;}
}


