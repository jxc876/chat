package org.mramirez.repo

import org.mramirez.model.Member
import org.springframework.data.repository.RepositoryDefinition
import org.springframework.data.repository.query.Param
import org.springframework.security.access.prepost.PreAuthorize

@RepositoryDefinition(domainClass=Member.class, idClass=Long.class)
interface MemberRepo {

	Member findOne(Long id)
	List<Member> findAll()
	List<Member> findByName(@Param("name") String name)
	List<Member> findByAlias(@Param("alias") String alias)
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	Member save(Member entity);
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	void delete(Long id);
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	void delete(Member member);
}
