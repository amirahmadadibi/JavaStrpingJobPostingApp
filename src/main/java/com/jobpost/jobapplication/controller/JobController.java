package com.jobpost.jobapplication.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobpost.jobapplication.model.JobPost;
import com.jobpost.jobapplication.service.JobService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
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
        public JobPost addJob(@RequestBody JobPost jobPost) {
                jobService.addJob(jobPost);
                return jobService.getJobById(jobPost.getPostId());
        }

        @GetMapping("/job/{id}")
        public JobPost getJobById(@PathVariable int id) {
                return jobService.getJobById(id);
        }
}
