package com.jobpost.jobapplication.model;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class JobPost {
        private int postId;
        private String postProfile;
        private String postDesc;
        private int regExprience;
        private List<String> postTechStack;

}
