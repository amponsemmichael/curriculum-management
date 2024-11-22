package com.amponsem.curriculum_management_service.service;

import com.amponsem.curriculum_management_service.dto.CurriculumDto;
import com.amponsem.curriculum_management_service.entity.Curriculum;
import jakarta.validation.Valid;

public interface CurriculumService {
    Curriculum createCurriculum(@Valid CurriculumDto curriculum);
}
