package com.job.portal.controller;

import java.util.List;

import com.job.portal.data.Job;
import com.job.portal.services.JobService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class JobController {
    
    @Autowired
    private JobService instanceOfJobService;

    @GetMapping("/jobs")
    public List<Job> getAllJobs() {
        return instanceOfJobService.getAllJobs();
    }

    @GetMapping("/jobs/{jobId}")
    public Job getJob(@PathVariable String jobId) {
        return instanceOfJobService.getJob(Long.parseLong(jobId));
    }

    @PostMapping("/jobs")
    public Job postJob(@RequestBody Job job) {
        return instanceOfJobService.postJob(job);
    }

    @PutMapping("/jobs")
    public Job updateJob(@RequestBody Job job) {
        return instanceOfJobService.updateJob(job);
    }

    @DeleteMapping("/jobs/{jobId}")
    public ResponseEntity<HttpStatus> deleteJob(@PathVariable String jobId) {
        try {
            instanceOfJobService.deleteJob(Long.parseLong(jobId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
