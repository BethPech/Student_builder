package org.example;

public class Main {
    public static void main(String[] args) {

        Student student1 = new StudentBuilder()
                .setName("Kate")
                .setSurname("Winslet")
                .getResult();

        Student student2 = new StudentBuilder()
                .setUniversity("Lobachev")
                .getResult();

        System.out.println(student1);
        System.out.println(student2);

    }
}