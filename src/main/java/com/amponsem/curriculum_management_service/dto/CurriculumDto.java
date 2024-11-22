package com.amponsem.curriculum_management_service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
public class CurriculumDto {
    private String id;

    @NotBlank(message = "Curriculum title is required")
    @Size(max = 255, message = "Title must be less than 255 characters")
    private String title;

    @Size(max = 1000, message = "Description must be less than 1000 characters")
    private String description;

    private String thumbnailPath;

    private List<String> learningObjectives;

    private String specializationId;
}
