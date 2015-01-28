package org.mramirez.model.projections

import org.mramirez.model.Member
import org.mramirez.model.Message
import org.springframework.data.rest.core.config.Projection

@Projection(types=Message.class, name = "summary")
interface MessageView {
	String getText();
	Date getDate();
	Member getMember();
}
