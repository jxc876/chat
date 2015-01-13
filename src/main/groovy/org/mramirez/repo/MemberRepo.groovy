package org.mramirez.repo

import org.mramirez.model.ChatRoom
import org.mramirez.model.Member
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.security.access.prepost.PreAuthorize


interface MemberRepo extends CrudRepository<Member, Long> {

	@PreAuthorize("hasRole('ROLE_USER')")
	Iterable<ChatRoom> findAll();
	
	// http://localhost:8080/members/search/findByName
	@PreAuthorize("hasRole('ROLE_USER')")
	List<Member> findByName(@Param("name") String name);
	
	// http://localhost:8080/members/search/findByAlias
	List<Member> findByAlias(@Param("alias") String alias);
}
