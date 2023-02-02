package bellajase.bellajase.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainController {

    @GetMapping("/")
    fun main(model: Model): String {
        model["titre"] = "accueil"
        return "accueil"
    }

    @GetMapping("/photo")
    fun photo(model: Model): String {
        return "photo"
    }

    @GetMapping("/service")
    fun services(model: Model): String {
        return "services"
    }

    @GetMapping("/contact")
    fun contact(model: Model): String {
        return "contact"
    }
}
