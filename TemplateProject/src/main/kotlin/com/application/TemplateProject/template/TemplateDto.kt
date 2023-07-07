package com.application.TemplateProject.template

import java.time.LocalDateTime

class TemplateDto(
    val id: Long,
    var name: String,
    var description: String,
    var createdOn: LocalDateTime,
    var category: String
) {
}