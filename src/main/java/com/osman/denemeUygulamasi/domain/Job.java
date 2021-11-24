package com.osman.denemeUygulamasi.domain;


import javax.persistence.*;

@Entity(name = "Job")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

   /* @Column(name = "JobName")
    private String jobName;*/

    @Column(name = "WorkPlace")
    private String workPlace;

    @Column(name = "Salary")
    private Integer salary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /*public String getJobName() {
        return jobName;
    }

    public void setJobName(String name) {
        this.jobName = jobName;
    }*/

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
