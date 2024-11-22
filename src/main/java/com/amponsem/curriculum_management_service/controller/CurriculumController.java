package com.amponsem.curriculum_management_service.controller;

import com.amponsem.curriculum_management_service.dto.CurriculumDto;
import com.amponsem.curriculum_management_service.entity.Curriculum;
import com.amponsem.curriculum_management_service.service.CurriculumService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/curricula")
public class CurriculumController {

    private final CurriculumService curriculumService;

    public CurriculumController(CurriculumService curriculumService) {
        this.curriculumService = curriculumService;
    }

    @PostMapping("/create")
    public Curriculum createCurriculum(
            @Valid @RequestBody CurriculumDto curriculumDto) {
        return curriculumService.createCurriculum(curriculumDto);
    }
}
