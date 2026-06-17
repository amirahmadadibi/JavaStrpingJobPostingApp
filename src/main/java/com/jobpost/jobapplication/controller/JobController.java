package com.jobpost.jobapplication.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobpost.jobapplication.model.JobPost;
import com.jobpost.jobapplication.service.JobService;

@RestController
public class JobController {

        private final JobService jobService;

        public JobController(JobService jobService) {
                this.jobService = jobService;
        }

        @GetMapping("/jobposts")
        public List<JobPost> getJobPosts() {
                return jobService.getAllJob();
        }

        @PostMapping("/job")
        public JobPost addJob(JobPost jobPost) {
                return jobService.addJob(jobPost);
        }

}
