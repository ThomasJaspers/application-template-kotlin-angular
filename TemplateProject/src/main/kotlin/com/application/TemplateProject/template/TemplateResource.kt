package com.application.TemplateProject.template

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TemplateResource {

    @GetMapping("/template")
    fun template(): String {
        return "template"
    }
}