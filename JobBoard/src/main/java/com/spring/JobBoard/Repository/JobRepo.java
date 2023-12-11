package com.spring.JobBoard.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.JobBoard.Entity.JobEntity;

public interface JobRepo extends JpaRepository<JobEntity,Integer>{
    
    JobEntity findByJobTitle(String jobName);
}
