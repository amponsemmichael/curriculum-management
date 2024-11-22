package com.amponsem.curriculum_management_service.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Entity
public class Curriculum extends BaseEntity {
    private String title;
    private String description;

//    @ManyToOne
//    private Specialization specialization;
}