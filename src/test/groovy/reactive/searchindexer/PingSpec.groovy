package reactive.searchindexer

import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest

@WebFluxTest(controllers = Ping.class)
class PingSpec extends BaseSpecification {

    def "GET /ping should respond with 'pong'"() {
        expect:
        webTestClient.get()
        .uri("/ping")
        .exchange()
        .expectStatus()
        .isEqualTo(200)
    }

}
