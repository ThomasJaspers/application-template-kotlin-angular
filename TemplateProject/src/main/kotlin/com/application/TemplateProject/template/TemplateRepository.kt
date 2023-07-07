package com.application.TemplateProject.template

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TemplateRepository : JpaRepository<Template, Long> {
}