package org.mramirez.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
class Group {

	@Id
	@GeneratedValue
	long id

	String groupName

	@OneToMany
	List<Member> members
}
