package com.job.portal.repository;

import com.job.portal.data.Job;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends MongoRepository<Job, Long> {
    
}
