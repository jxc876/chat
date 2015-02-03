package org.mramirez

import org.mramirez.model.ChatRoom
import org.mramirez.model.Member
import org.mramirez.model.Message
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration

@Import(RepositoryRestMvcConfiguration.class)
@Configuration
class RestConfig extends RepositoryRestMvcConfiguration {

	@Override
	protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(ChatRoom.class, Member.class, Message.class);
	}
}
