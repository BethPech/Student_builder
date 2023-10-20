package org.example;

public class Student {
    private String name;
    private String surname;
    private String dateOfBirth;
    private String city;
    private String university;

    public Student(String name, String surname, String dateOfBirth, String city, String university){
        this.name=name;
        this.surname=surname;
        this.dateOfBirth=dateOfBirth;
        this.city=city;
        this.university=university;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public String getCity(){
        return city;
    }
    public String getUniversity(){
        return university;
    }
}
