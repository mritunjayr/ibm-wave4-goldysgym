package com.stackroute.adminservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Document("program")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Program {

    @Id
    private String programId;
    @NotNull
    private String programName;
    @NotNull
    private String day;
    @NotNull
    private String timing;
    @NotNull
    private String imageUrl;
    @NotNull
    private String programDescription;
    @NotNull
    private String trainerName;
    @NotNull
    private String trainerDescription;
    @NotNull
    private int totalSeats;


}
