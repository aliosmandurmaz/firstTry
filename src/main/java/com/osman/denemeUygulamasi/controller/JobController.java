package com.osman.denemeUygulamasi.controller;


import com.osman.denemeUygulamasi.constant.ApiEndpoints;
import com.osman.denemeUygulamasi.domain.Job;
import com.osman.denemeUygulamasi.model.JobDTO;
import com.osman.denemeUygulamasi.payload.SuccessResponse;
import com.osman.denemeUygulamasi.service.impl.JobServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class JobController {


    @Autowired
    JobServiceImpl jobServiceIpml;

    @RequestMapping(value = ApiEndpoints.GET_JOB, method = RequestMethod.GET)
    public ResponseEntity<?> getJob(@RequestParam(value = "id") Integer id) {
        return ResponseEntity.ok(new SuccessResponse(jobServiceIpml.getJob(id)));
    }

    @RequestMapping(value = ApiEndpoints.LIST_JOB, method = RequestMethod.GET)
    public ResponseEntity<?> getList() {
        return ResponseEntity.ok(new SuccessResponse(jobServiceIpml.listJob()));
    }

    @RequestMapping(value = ApiEndpoints.CREATE_JOB, method = RequestMethod.POST)
    public ResponseEntity<?> createJob(@RequestBody JobDTO dto) {

        Job job = new Job();
        job.setId(dto.getId());
        //job.setJobName(dto.getJobName());
        job.setWorkPlace(dto.getWorkPlace());
        job.setSalary(dto.getSalary());

        return ResponseEntity.ok(new SuccessResponse(jobServiceIpml.createJob(job)));
    }

    @RequestMapping(value = ApiEndpoints.DELETE_JOB, method = RequestMethod.POST)
    public ResponseEntity<?> deleteJob(@RequestBody JobDTO dto) {
        jobServiceIpml.deleteJob(dto.getId());

        return ResponseEntity.ok(new SuccessResponse(null));
    }

    @RequestMapping(value = ApiEndpoints.EXIST_BY_ID, method = RequestMethod.GET)
    public ResponseEntity<?> existById(@RequestBody JobDTO dto) {
        return ResponseEntity.ok(new SuccessResponse(jobServiceIpml.existById(dto.getId())));

    }
}