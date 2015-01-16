package org.mramirez

import javax.annotation.PostConstruct

import org.h2.tools.Server
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Import
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity


@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableJpaRepositories
@Import(RepositoryRestMvcConfiguration.class)
@SpringBootApplication
class ChatApplication {

	static void main(String[] args) {
		SpringApplication.run ChatApplication, args
	}

	@PostConstruct
	void h2WebServer(){
		println '**************** starting H2 Web Server ****************'
		Server.createWebServer("-web","-webAllowOthers", "-webPort", "8082").start()
	}
}
