package com.fedex.plefs.system.console.domain.application;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties("maven")
public class ApplicationProperties {

    @Getter @Setter
    private MavenProject project;

    @ToString @Getter @Setter
    public static class MavenProject {

        private String name;
        private String version;
        private String java;
    }
}
