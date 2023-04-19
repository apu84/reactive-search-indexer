package reactive.searchindexer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class Ping {
    @GetMapping("/ping")
    Mono<String> ping() {
        return Mono.just("Pong");
    }
}
