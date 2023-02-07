package bellajase.bellajase.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size


data class ContactDTO(

    @field:NotBlank
    @Size(min=3, max=15)
    val surname: String = "",

    @field:NotBlank
    @Size(min=3, max=15)
    val name: String = "",

    @field:NotBlank
    @Size(min=3, max=15)
    val num: String = "",

    @field:NotBlank
    @Size(min=3, max=15)
    val message: String = "",

    @field:NotBlank
    @Size(min=3, max=50)
    val email: String = "",

    val id: Long? = null

    )


