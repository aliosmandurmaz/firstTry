package com.osman.denemeUygulamasi.service.impl;


import com.osman.denemeUygulamasi.domain.Job;

import java.util.List;

public interface JobService {

    Job getJob(Integer id);

    List<Job> listJob();

    Job createJob(Job job);

    void deleteJob(Integer id);

    boolean existById(Integer id);



}
