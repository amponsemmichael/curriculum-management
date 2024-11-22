package com.amponsem.curriculum_management_service.repository;

import com.amponsem.curriculum_management_service.entity.Curriculum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CurriculumRepository extends JpaRepository<Curriculum, String> {
    List<Curriculum> findBySpecializationId(String specializationId);
}
