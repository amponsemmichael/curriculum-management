package com.amponsem.curriculum_management_service.service.impl;

import com.amponsem.curriculum_management_service.dto.CurriculumDto;
import com.amponsem.curriculum_management_service.entity.Curriculum;
import com.amponsem.curriculum_management_service.repository.CurriculumRepository;
import com.amponsem.curriculum_management_service.service.CurriculumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurriculumServiceImpl implements CurriculumService {

    @Autowired
    public CurriculumServiceImpl(CurriculumRepository curriculumRepository) {


    }

    @Override
    public Curriculum createCurriculum(Curriculum curriculum) {
        return null;
    }
}

