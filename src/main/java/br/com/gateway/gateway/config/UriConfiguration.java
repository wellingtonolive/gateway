package br.com.gateway.gateway.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
@Getter
@Setter
public class UriConfiguration {

    private String httpbin = "http://httpbin.org:80";
}
