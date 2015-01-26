package org.mramirez.repo

import org.mramirez.model.Message
import org.springframework.data.repository.CrudRepository

interface MessageRepo extends CrudRepository<Message, Long> {
	
}
