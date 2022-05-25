package br.com.gateway.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequestMapping("/")
@RestController
public class ExamplesControllers {

    @RequestMapping("fallback")
    public Mono<String> fallback(){
        return Mono.just("fallback");
    }
}
