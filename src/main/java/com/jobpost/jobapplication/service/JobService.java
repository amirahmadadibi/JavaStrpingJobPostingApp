package com.jobpost.jobapplication.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jobpost.jobapplication.model.JobPost;
import com.jobpost.jobapplication.repository.JobRepository;


@Service
public class JobService {
        private JobRepository jobRepository = new JobRepository();

        public JobPost addJob(JobPost jobPost) {
                return jobRepository.addJob(jobPost);
        }

        public List<JobPost> getAllJob() {
                return jobRepository.getAllJob();
        }
        public JobPost getJobById(int id) {
                return jobRepository.getJobById(id);
        }
}
