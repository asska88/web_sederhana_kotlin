@file:Suppress("UNUSED_EXPRESSION")

package web.sederhana.controller
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import web.sederhana.entity.Article
import web.sederhana.service.ArticleService


@Controller
@RequestMapping("")

class HomeController {
    @Autowired
    lateinit var articleService: ArticleService

    @GetMapping("")
    fun welcome(model: Model): String {
        val message = " welcome to my web "
        model["msg"] = message
        model["mahasiswa"] = articleService.findAll()
        return "index"
    }
    @GetMapping("/add")
    fun add(model: Model ): String {
        model["addMahasiswa"] = Article()
            return "add"
        }
    @PostMapping("/save")
    fun save(article: Article, model: Model): String {
        articleService.add(article)
            return "redirect:/"
        }
    @GetMapping("/{id}")
    fun delete(@PathVariable id:Long): String {
        articleService.delete(id)
        return "redirect:/"
    }
    @GetMapping("/edit/{id}")
    fun modif (@PathVariable id: Long, model: Model): String {
        model["addMahasiswa"] = articleService.findById(id)
        return buildString {
        append("edit")
    }
        }
    @PostMapping("/update")
    fun modif(article: Article,model: Model): String {
    articleService.update(article)
        return "redirect:/"
    }
}
