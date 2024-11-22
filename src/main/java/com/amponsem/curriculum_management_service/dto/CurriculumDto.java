package com.amponsem.curriculum_management_service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CurriculumDto {
    @NotBlank
    private String title;

    @Size(max = 1000)
    private String description;

    private String specializationId;
}
