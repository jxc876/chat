package org.mramirez.repo

import org.mramirez.model.ChatRoom
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.Description
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.annotation.RestResource


interface ChatRoomRepo extends CrudRepository<ChatRoom, Long> {

	Iterable<ChatRoom> findAll()

	@RestResource(path="memberAlias")
	Iterable<ChatRoom> findByMembers_AliasIgnoreCaseContaining(@Param("alias") String a)

	@RestResource(path="roomName")
	Iterable<ChatRoom> findByRoomNameIgnoreCaseContaining(@Param("name") String n)
}
