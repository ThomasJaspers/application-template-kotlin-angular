package com.application.TemplateProject.bootstrapping

import com.application.TemplateProject.template.Template
import com.application.TemplateProject.template.TemplateRepository
import org.springframework.beans.factory.InitializingBean
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDateTime

@Profile("bootstrap")
@Component
class Bootstrapper (
    private val templateRepository: TemplateRepository
) : InitializingBean {

    @Transactional
    override fun afterPropertiesSet() {

        val template = Template()
        template.name = "Testname"
        template.description = "This is a test description"
        template.createdOn = LocalDateTime.now();
        template.category = "CAT-1"

        templateRepository.save(template)
    }

}