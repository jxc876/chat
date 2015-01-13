package org.mramirez.repo

import org.mramirez.model.ChatRoom
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param


interface ChatRoomRepo extends CrudRepository<ChatRoom, Long> {

	//	@PreAuthorize("hasRole('ROLE_ADMIN')")
	Iterable<ChatRoom> findAll()

	// http://localhost:8080/chatRooms/search/
	Iterable<ChatRoom> findByMembers_Alias(@Param("alias") String alias)
}
