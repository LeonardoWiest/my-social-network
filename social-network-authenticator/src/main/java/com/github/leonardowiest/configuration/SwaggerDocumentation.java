package com.github.leonardowiest.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerDocumentation {

	private static final String BASE_PACKAGE = "com.github.leonardowiest.controller";

	@Bean
	public Docket socialNetworkAuthenticatorApiDoc() {

		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
				.build();
	}
}
