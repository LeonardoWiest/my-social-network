package com.github.leonardowiest.autoconfiguration;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerDocumentation {

	private static final String BASE_PACKAGE = "com.github.leonardowiest.controller";

	@Bean
	public Docket socialNetworkAuthenticatorApi() {

		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
				.paths(PathSelectors.ant("/**")).build().useDefaultResponseMessages(true).apiInfo(this.getApiInfo())
				.globalOperationParameters(Arrays
						.asList(new ParameterBuilder().name("Authorization").description("Header para o Token JWT")
								.modelRef(new ModelRef("string")).parameterType("header").required(false).build()));
	}

	private ApiInfo getApiInfo() {

		return new ApiInfoBuilder().title("Social Network Authenticator").description("Documentação").version("1.0.0")
				.license("Apache License Version 2.0").licenseUrl("#").contact(new Contact("HelloSquad ", "#", null))
				.build();
	}
}
