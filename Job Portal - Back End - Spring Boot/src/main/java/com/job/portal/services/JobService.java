package com.job.portal.services;

import java.util.List;

import com.job.portal.data.Job;

public interface JobService {

    public List<Job> getAllJobs();

    public Job getJob(long jobId);

    public Job postJob(Job job);

    public Job updateJob(Job job);

    public void deleteJob(Long jobId);
}
