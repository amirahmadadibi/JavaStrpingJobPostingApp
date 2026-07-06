package com.jobpost.jobapplication.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jobpost.jobapplication.model.JobPost;

@Repository
public class JobRepository {
        List<JobPost> jobPosts = new ArrayList<>();

        public JobRepository() {
                jobPosts.add(new JobPost(1, "Software Engineer",
                                "We are looking for a Software Engineer with 5 years of experience in Java and Spring Boot",
                                5, Arrays.asList("Java", "Spring Boot", "MySQL", "AWS")));
                jobPosts.add(new JobPost(2, "Data Scientist",
                                "We are looking for a Data Scientist with 3 years of experience in Python and Machine Learning",
                                3, Arrays.asList("Python", "Machine Learning", "AWS", "SQL")));
                jobPosts.add(new JobPost(3, "Project Manager",
                                "We are looking for a Project Manager with 10 years of experience in Project Management",
                                10, Arrays.asList("Project Management", "Agile", "Scrum", "Kanban")));
        }

        public List<JobPost> getAllJob() {
                return jobPosts;
        }

        public JobPost addJob(JobPost jobPost) {
                jobPosts.add(jobPost);
                return jobPost;
        }

        public JobPost getJobById(int id) {
                return jobPosts.stream().filter(jobPost -> jobPost.getPostId() == id).findFirst().orElse(null);
        }

        public JobPost updateJob(JobPost jobPost) {
                JobPost existingJobPost = jobPosts.stream().filter(j -> j.getPostId() == jobPost.getPostId())
                                .findFirst().orElse(null);
                if (existingJobPost != null) {
                        existingJobPost.setPostProfile(jobPost.getPostProfile());
                        existingJobPost.setPostDesc(jobPost.getPostDesc());
                        existingJobPost.setRegExprience(jobPost.getRegExprience());
                        existingJobPost.setPostTechStack(jobPost.getPostTechStack());
                }
                return existingJobPost;
        }
}