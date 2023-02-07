package bellajase.bellajase.repository


import bellajase.bellajase.domain.Contact
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository


interface  ContactRepository : CrudRepository<Contact, Long> {

}
