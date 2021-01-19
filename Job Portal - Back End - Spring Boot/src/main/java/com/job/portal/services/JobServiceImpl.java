package com.job.portal.services;

import java.util.List;

import com.job.portal.data.Job;
import com.job.portal.repository.JobRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements JobService {

    
    @Autowired
    private JobRepository instanceOfJobRepository;

    @Override
    public List<Job> getAllJobs() {
        return instanceOfJobRepository.findAll();
    }

    @Override
    public Job getJob(long jobId) {
        return instanceOfJobRepository.findById(jobId).get();
    }

    @Override
    public Job postJob(Job job) {
        instanceOfJobRepository.save(job);
        return job;
    }

    @Override
    public Job updateJob(Job job) {
        instanceOfJobRepository.save(job);
        return job;
    }

    @Override
    public void deleteJob(Long jobId) {
        instanceOfJobRepository.deleteById(jobId);
    }
    
}
