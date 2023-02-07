package bellajase.bellajase.domain

import jakarta.persistence.*



@Entity
@Table(name = "Contact")
class Contact(
    @Column(name = "Nom", unique = false, nullable = false)
    var surname: String,

    @Column(name = "Prénom" ,unique = false, nullable = false)
    var name: String,

    @Column(name = "Telephone",unique = false, nullable = false)
    var num: String,

    @Column(name = "Message",unique = false, nullable = false)
    var message: String,

    @Column(name = "EmailAddress",unique = false, nullable = false)
    var email: String,

    @Id @GeneratedValue var id: Long? = null
)

