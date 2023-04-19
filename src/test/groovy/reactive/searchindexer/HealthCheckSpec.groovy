package reactive.searchindexer

import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest

@WebFluxTest(controllers = HealthCheck.class)
class HealthCheckSpec extends BaseSpecification {

    def "GET /ping should respond with 'pong'"() {
        expect:
        webTestClient.get()
        .uri("/health-check/ping")
        .exchange()
        .expectStatus()
        .isEqualTo(200)
    }

}
