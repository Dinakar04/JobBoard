 package com.spring.JobBoard.Entity;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class JobEntity {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer jobId;
    String jobTitle;
    String description;
    double salary;
    double experiance;
    String location;
    String jobType;



    public Integer getJobId() {
        return jobId;
    }
    

    public String getJobTitle() {
        return jobTitle;
    }


    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public double getSalary() {
        return salary;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }


    public double getExperiance() {
        return experiance;
    }
    public void setExperiance(double experiance) {
        this.experiance = experiance;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getJobType() {
        return jobType;
    }
    public void setJobType(String jobType) {
        this.jobType = jobType;
    }


    public JobEntity(String jobTitle, String description, double salary, double experiance, String location,
            String jobType) {
        this.jobTitle = jobTitle;
        this.description = description;
        this.salary = salary;
        this.experiance = experiance;
        this.location = location;
        this.jobType = jobType;
    }


    public JobEntity() {
    }

    


}