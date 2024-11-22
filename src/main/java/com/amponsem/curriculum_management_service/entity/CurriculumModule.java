package com.amponsem.curriculum_management_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class CurriculumModule extends BaseEntity {
    private String title;
    private String description;

    @ManyToOne
    private Curriculum curriculum;
}

