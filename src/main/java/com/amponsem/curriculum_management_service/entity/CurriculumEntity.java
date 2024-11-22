package com.amponsem.curriculum_management_service.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "curricula")
public class CurriculumEntity extends BaseEntity {
    @Column(nullable = false, length = 255)
    private String title;

    @Column(length = 1000)
    private String description;

    @Column(length = 500)
    private String thumbnailPath;

    @ElementCollection
    @CollectionTable(name = "curriculum_learning_objectives", joinColumns = @JoinColumn(name = "curriculum_id"))
    @Column(name = "objective")
    private List<String> learningObjectives;

//    @ManyToOne
//    @JoinColumn(name = "specialization_id")
//    private Specialization specialization;

    @OneToMany(mappedBy = "curriculum", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CurriculumModule> modules;
}

