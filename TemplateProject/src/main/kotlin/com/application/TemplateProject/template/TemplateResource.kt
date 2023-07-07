package com.application.TemplateProject.template

import lombok.AllArgsConstructor
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@AllArgsConstructor
class TemplateResource(
    private final val templateRepository: TemplateRepository
) {
    @GetMapping("/template")
    fun template(): Long {
        return templateRepository.count();
    }
}