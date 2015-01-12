package org.mramirez.model

import groovy.transform.ToString

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
@ToString
class Member {

	@Id
	@GeneratedValue
	long id

	String name
	String alias
}
