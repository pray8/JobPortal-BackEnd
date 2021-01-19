package com.job.portal.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Document(collection = "Job")
@AllArgsConstructor
public class Job {
    @Id
    @Getter @Setter
    private long jobId;

    @Getter @Setter
    private String companyName;

    @Getter @Setter
    private String jobTitle;

    @Getter @Setter
    private String skillKeywords;

    @Getter @Setter
    private String jobDescription;
    
    @Getter @Setter
    private String location;

}
