package io.notforme.jpa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoSpringdataApplication {

}
// JPA 사용에 필요한 모든 빈이 자동 생성 된다.
// HibernateJpaAutoConfiguration로
fun main(args: Array<String>) {
    runApplication<DemoSpringdataApplication>(*args)
}
