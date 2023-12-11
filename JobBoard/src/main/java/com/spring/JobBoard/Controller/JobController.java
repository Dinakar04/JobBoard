package com.spring.JobBoard.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.JobBoard.Entity.JobEntity;
import com.spring.JobBoard.Service.JobService;

@RestController
@RequestMapping("/jobs")
public class JobController {
    

    @Autowired
    private JobService jobService;

    @GetMapping("/get")
    public List<JobEntity> getAllJobs(){
        return jobService.getAllJob();
    }

    @PostMapping("/add")
    public JobEntity addJob(@RequestBody JobEntity jobEntity){
        return jobService.addJob(jobEntity);
    }

    @PutMapping("/update/{jobId}")
    public JobEntity updateJob(@PathVariable Integer jobId,@RequestBody JobEntity jobEntity ){
        return jobService.updateJob(jobEntity,jobId);
    }

    @DeleteMapping("/delete/{jobId}")
    public String deketJob(@PathVariable Integer jobId){
        return jobService.deleteJob(jobId);
    }
}
