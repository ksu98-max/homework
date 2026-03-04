package pages;

import com.codeborne.selenide.SelenideElement;

import static testData.TestData.firstName;

public class PracticeForm {

    //elements
   SelenideElement firstNameInput $("#firstName");
   SelenideElement lastNameInput $("#lastName");

   //action
    public void typeFirstName(String value){
        firstNameInput.setValue(value);

        public void typeLastName(String value){
            lastNameInput.setValue(value);
    }
}
