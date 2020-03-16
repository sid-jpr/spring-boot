package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student
{
    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String name;
    private String branch;
    private Integer credits;
    private Double gpa;
 
    public Student()
    {
    }

    public Student(Integer id, String name, String branch, Integer credits, Double gpa)
    {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.credits = credits;
        this.gpa = gpa;
    }
    public Integer getId(){  
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    
    public Double getGpa(){  
        return gpa;
    }
    public void setGPA(Double gpa){
        this.gpa = gpa;
    }
    
    public Integer getCredits(){  
        return credits;
    }
    public void setCredits(Integer credits){
        this.credits = credits;
    }

    
    public String getBranch(){
        return branch;
    }
    public void setBranch(String branch){
        this.branch = branch;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

