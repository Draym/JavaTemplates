package com.test;

public class User {
    private String name;
    private String password;
    private String gender;
    private Integer age;
    private String action;
    private String countryCode;
    private String animalId;
    private String message;

    public User() {

    }

    public void init(String name, String password, String gender, Integer age, String action, String countryCode, String animalId, String message) {
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.age = age;
        this.action = action;
        this.countryCode = countryCode;
        this.animalId = animalId;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getAnimalId() {
        return animalId;
    }

    public void setAnimalId(String animalId) {
        this.animalId = animalId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
