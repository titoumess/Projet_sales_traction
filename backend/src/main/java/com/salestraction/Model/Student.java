package com.salestraction.model;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_student;

    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String phone_number;
    private Integer postal_code1;
    private Integer postal_code2;
    private String comment;
    private String school;
    private String skills;
    private String linkedin_url;
    private Integer adminValidation = 0;
    private Integer age;

    public Student() {}

    public Student(Integer id_student, String firstname, String lastname, String email, String password, String phone_number,
                   Integer postal_code1, Integer postal_code2, String comment, String school,
                   String skills, String linkedin_url, Integer admin_validation, Integer age) {
        this.id_student = id_student;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.phone_number = phone_number;
        this.postal_code1 = postal_code1;
        this.postal_code2 = postal_code2;
        this.comment = comment;
        this.school = school;
        this.skills = skills;
        this.linkedin_url = linkedin_url;
        this.adminValidation = admin_validation;
        this.age = age;
    }

    // Getters et Setters
    public Integer getId_student() {
        return id_student;
    }

    public void setId_student(Integer id_student) {
        this.id_student = id_student;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Integer getPostal_code1() {
        return postal_code1;
    }

    public void setPostal_code1(Integer postal_code1) {
        this.postal_code1 = postal_code1;
    }

    public Integer getPostal_code2() {
        return postal_code2;
    }

    public void setPostal_code2(Integer postal_code2) {
        this.postal_code2 = postal_code2;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getLinkedin_url() {
        return linkedin_url;
    }

    public void setLinkedin_url(String linkedin_url) {
        this.linkedin_url = linkedin_url;
    }

    public Integer getAdminValidation() {
        return adminValidation;
    }

    public void setAdminValidation(Integer admin_validation) {
        this.adminValidation = admin_validation;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

