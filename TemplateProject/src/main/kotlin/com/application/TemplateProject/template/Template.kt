package com.application.TemplateProject.template

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity
class Template(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L,
    var name: String,
    var text: String,
    var createdOn: LocalDateTime,
    var category: String
)  {
}