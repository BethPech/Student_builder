package org.example;

public class StudentBuilder implements Builder{
    private String name;
    private String surname;
    private String dateOfBirth;
    private String city;
    private String university;

    @Override
    public StudentBuilder setName(String name){
        this.name = name;
        return this;
    }

    @Override
    public StudentBuilder setSurname(String surname){
        this.surname = surname;
        return this;
    }
    @Override
    public StudentBuilder setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
        return this;
    }
    @Override
    public StudentBuilder setCity(String city){
        this.city = city;
        return this;
    }
    @Override
    public StudentBuilder setUniversity(String university){
        this.university = university;
        return this;
    }

    public Student getResult(){
        return new Student(this.name, this.surname, this.dateOfBirth, this.city, this.university);
    }
}
