package com.osman.denemeUygulamasi.service.impl;

import com.osman.denemeUygulamasi.domain.Job;
import com.osman.denemeUygulamasi.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService{

    @Autowired
    JobRepository jobRepository;

    @Override
    public Job getJob(Integer id) {
        return jobRepository.findById(id).orElse(null);
    }

    @Override
    public List<Job> listJob() {
        return jobRepository.findAll();
    }

    @Override
    public Job createJob(Job job) {
        return jobRepository.save(job);
    }

    @Override
    public void deleteJob(Integer id) {
        jobRepository.deleteById(id);
    }

    @Override
    public boolean existById(Integer id) {
        return jobRepository.existsById(id);
    }


}
