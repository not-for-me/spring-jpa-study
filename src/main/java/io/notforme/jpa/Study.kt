package io.notforme.jpa

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
data class Study(
        @Id @GeneratedValue
        val id: Long? = null,
        val name: String,
        @ManyToOne
        var owner: Account? = null
)