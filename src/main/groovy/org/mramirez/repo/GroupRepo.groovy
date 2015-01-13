package org.mramirez.repo

import org.mramirez.model.ChatRoom
import org.springframework.data.repository.CrudRepository
import org.springframework.security.access.prepost.PreAuthorize


interface GroupRepo extends CrudRepository<ChatRoom, Long> {

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	Iterable<ChatRoom> findAll();
}
