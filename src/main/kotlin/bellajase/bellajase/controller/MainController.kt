package bellajase.bellajase.controller

import bellajase.bellajase.dto.ContactDTO
import bellajase.bellajase.repository.ContactRepository
import bellajase.bellajase.toContact
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping

@Controller
class MainController @Autowired constructor( private val contactRepository: ContactRepository) {

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
    fun contact(contactDTO: ContactDTO): String {
        return "contact"
    }

    @PostMapping("/contact")
    fun addContact(@Valid contactDTO: ContactDTO, bindingResult: BindingResult): String {
        return if (bindingResult.hasErrors()) {
            "accueil"
        } else {
            contactRepository.save(contactDTO.toContact())
            "accueil"
        }
    }
}
