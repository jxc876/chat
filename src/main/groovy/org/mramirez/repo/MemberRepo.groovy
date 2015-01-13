package org.mramirez.repo

import org.mramirez.model.ChatRoom;
import org.mramirez.model.Member
import org.springframework.data.repository.CrudRepository
import org.springframework.security.access.prepost.PreAuthorize


interface MemberRepo extends CrudRepository<Member, Long> {
	
	@PreAuthorize("hasRole('ROLE_USER')")
	Iterable<ChatRoom> findAll();
}
