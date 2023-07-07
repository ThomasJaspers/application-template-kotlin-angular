package com.application.TemplateProject.template

import lombok.AllArgsConstructor
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@AllArgsConstructor
class TemplateResource(
    private val templateRepository: TemplateRepository
) {
    @GetMapping("/template")
    fun template(): List<TemplateDto> {
        return templateRepository.findAll()
            .map { TemplateDto(it.id, it.name, it.description, it.createdOn, it.category) }
    }
}