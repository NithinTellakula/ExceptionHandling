package com.example.Exception;

public class ExceptionHandling {
    public static void main(String[] args) {
        AService aService = new AService(21, "Male");
        AService aService1 = new AService(17, "Female");

        try {
            if ("Male".equalsIgnoreCase(aService.getGender()) && (aService.getAge() <= 20)) {

                throw new InSufficientMaleAgeException("Male Age must be at least 21 to get married");
            }
        }catch(InSufficientAgeException e){
            System.out.println("Caught InSufficientAgeException: " + e);
        }

        try{
            if("Female".equalsIgnoreCase(aService1.getGender())&&(aService1.getAge() <=17)){
                throw new InSufficientFemaleException("Female Age must be at least 18 to get married");

            }
        } catch (InSufficientAgeException e) {
            System.out.println("Caught InSufficientAgeException: " + e);
        }
    }
}