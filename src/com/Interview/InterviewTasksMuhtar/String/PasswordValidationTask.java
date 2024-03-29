package com.Interview.InterviewTasksMuhtar.String;

public class PasswordValidationTask {
    /*
       String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.

    requirements:

1. Password MUST be at least have 6 characters and should not contain space

2. PassWord should at least contain one upper case letter

3. PassWord should at least contain one lowercase letter

4. Password should at least contain one special characters

5. Password should at least contain a digit

if all requirements above are met, the method returns true, otherwise returns  false

     */
    public static void main(String[] args) {

    }


   // Solution 1:
    /*
   Password Validation in Gherkin Language

  Scenario: Password Validation
    Given the user is on password setting page
    When the user enters the password at least has with 6 characters
    And password does not contain any spaces
    And password has at lease one lowercase
    And password has at least one uppercase
    And password has at least one digit
    And password has at least one special character
    When the user clicks on the create button on password setting page
    Then the user should be able to set a password
    Then password successfully created message is displayed

     */

    public static boolean passWordvalidation(String password) {

        String lowercase="(.*[a-z].*)";

        String uppercase="(.*[A-Z].*)";

        String numbers="(.*[0-9].*)";

        String specialchars="(.*[ -/, :-@].*)";



        boolean  HasLower = password.matches(lowercase),

                HasUppere = password.matches(uppercase),

                HasDigits = password.matches(numbers),

                HasSpecial = password.matches(specialchars);

        boolean    Valid = false;

        if(password.length() >= 6 && !password.contains(" "))

            if( HasLower && HasUppere && HasDigits && HasSpecial)

                Valid = true;

        return Valid;

    }
}
