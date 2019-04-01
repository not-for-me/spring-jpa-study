package io.notforme.jpa

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
data class Account(
        @Id // account의 id
        @GeneratedValue //  db가 자동생성하는 값을 id로 사용
        val id: Long? = null,
        // 이후 field에 Column 어노테이션을 붙여도 되지만 안 붙여도 된다. 위에 @Entity가 있기 때문
        val username: String,
        val password: String
//        @OneToMany(mappedBy = "owner")
//        val studies: MutableSet<Study> = HashSet()
) {
    fun addStudy(study: Study) {
//        this.studies.add(study)
        study.owner = this
    }
}

