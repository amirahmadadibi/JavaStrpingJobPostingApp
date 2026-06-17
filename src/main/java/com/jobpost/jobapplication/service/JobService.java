package com.jobpost.jobapplication.service;

import java.util.List;

import com.jobpost.jobapplication.model.JobPost;
import com.jobpost.jobapplication.repository.JobRepository;

public class JobService {
        private JobRepository jobRepository = new JobRepository();

        public void addJob(JobPost jobPost) {
                jobRepository.addJob(jobPost);
        }

        public List<JobPost> getAllJob() {
                return jobRepository.getAllJob();
        }
}
