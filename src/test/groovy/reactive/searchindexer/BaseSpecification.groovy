package reactive.searchindexer

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.ComponentScan
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.web.reactive.server.WebTestClient
import spock.lang.Specification

@ContextConfiguration()
@ComponentScan(["reactive.searchindexer"])
class BaseSpecification extends Specification {
    @Autowired
    WebTestClient webTestClient;

    def "Simple assertion to test Spock setup"() {
        expect:
        1 == 1
    }
}
