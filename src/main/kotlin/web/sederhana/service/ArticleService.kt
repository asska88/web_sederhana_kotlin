package web.sederhana.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import web.sederhana.entity.Article
import web.sederhana.service.repository.Repository
import javax.transaction.Transactional
import java.util.Optional

@Service
@Transactional
class ArticleService {

    @field:Autowired
    private lateinit var repo: Repository

    fun findAll(): Iterable<Article> {
        return repo.findAll()
    }
    fun add(article: Article)  {
        repo.save(article)
    }
    fun delete(id: Long) {
        repo.deleteById(id)
    }
    fun findById (id: Long): Optional<Article> {
       return repo.findById(id)
    }
    fun update(article: Article){
        repo.save(article)
    }
}
