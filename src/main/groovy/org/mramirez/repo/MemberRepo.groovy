package org.mramirez.repo

import org.mramirez.model.Member
import org.springframework.data.repository.CrudRepository

interface MemberRepo extends CrudRepository<Member, Long> {
}
