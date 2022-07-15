package web.sederhana.service.repository

import org.springframework.data.repository.CrudRepository
import web.sederhana.entity.Article

interface Repository: CrudRepository<Article, Long>