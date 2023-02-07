package bellajase.bellajase

import bellajase.bellajase.domain.Contact
import bellajase.bellajase.dto.ContactDTO

fun ContactDTO.toContact(): Contact = Contact(
    name = this.name,
    surname = this.surname,
    num = this.num,
    message = this.message,
    email = this.email
)