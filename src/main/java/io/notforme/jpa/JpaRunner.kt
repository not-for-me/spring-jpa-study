package io.notforme.jpa

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext
import javax.transaction.Transactional

@Component
@Transactional
class JpaRunner(
        @PersistenceContext
        val entityManager: EntityManager // JPA 핵심 클래스
) : ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        val acc = Account(username = "woojin", password = "jp")

        val study = Study(name = "Kotlin")
        acc.addStudy(study)

        entityManager.persist(acc)
        entityManager.persist(study)

        // java class 참조 하는 방법
//        val session = entityManager.unwrap(Session::class.java)
//        session.save(Account(username = "woojin", password = "session"))
    }
}
