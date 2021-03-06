package com.mhkim.opendata.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@ConfigurationProperties(prefix = "opendata")
@Getter
@Setter
@ToString
public class OpendataProp {

    private String baseUrl;
    private String serviceUrl;
    private String serviceKey;
    private String numOfRows;

}
