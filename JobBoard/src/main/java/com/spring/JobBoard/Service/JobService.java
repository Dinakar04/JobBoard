package com.spring.JobBoard.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.JobBoard.Entity.JobEntity;
import com.spring.JobBoard.Repository.JobRepo;

import jakarta.persistence.EntityNotFoundException;

@Service
public class JobService {
    
    @Autowired
    private JobRepo jobRepo;


    public List<JobEntity> getAllJob(){
        return jobRepo.findAll();
    }

    public Optional<JobEntity> getByJobId(Integer jobId){
        return jobRepo.findById(jobId);
    }

    public JobEntity addJob(JobEntity jobEntity){
        return jobRepo.save(jobEntity);
    }

     public JobEntity updateJob(JobEntity newjobEntity, Integer jobId){
        JobEntity oldJobEntity = jobRepo.findById(jobId)
        .orElseThrow(() -> new EntityNotFoundException("job not found"));

         BeanUtils.copyProperties(newjobEntity, oldJobEntity);

         return oldJobEntity;

    }

    public String deleteJob(Integer jobId){
        jobRepo.deleteById(jobId);
        return "job deleted";
    }
}
