package com.example.Exception;

public class AService {
    private int age;
    private String gender;

    public AService(int age, String gender) {
        this.age = age;
        this.gender = gender;


        BService b = new BService();
        b.B();

    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }

}
