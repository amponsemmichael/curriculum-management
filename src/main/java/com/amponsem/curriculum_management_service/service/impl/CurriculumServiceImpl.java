package com.amponsem.curriculum_management_service.service.impl;

import com.amponsem.curriculum_management_service.dto.CurriculumDto;
import com.amponsem.curriculum_management_service.entity.Curriculum;
import com.amponsem.curriculum_management_service.repository.CurriculumRepository;
import com.amponsem.curriculum_management_service.service.CurriculumService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurriculumServiceImpl implements CurriculumService {

    private final CurriculumRepository curriculumRepository;

    @Autowired
    public CurriculumServiceImpl(final CurriculumRepository curriculumRepository, CurriculumRepository curriculumRepository1) {
        this.curriculumRepository = curriculumRepository1;
    }

    @Override
    public Curriculum createCurriculum(final @Valid CurriculumDto curriculum) {
      return curriculumRepository.save(curriculum);
    }
}


