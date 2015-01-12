package org.mramirez.repo

import org.mramirez.model.ChatRoom
import org.springframework.data.repository.CrudRepository

interface GroupRepo extends CrudRepository<ChatRoom, Long> {

}
