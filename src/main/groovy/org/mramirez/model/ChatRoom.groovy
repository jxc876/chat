package org.mramirez.model

import groovy.transform.ToString

import javax.persistence.ElementCollection
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToMany

@Entity
@ToString
class ChatRoom {

	@Id
	@GeneratedValue
	long id
	String roomName

	@ManyToMany
	Set<Member> members

	@ElementCollection
	List<String> history
}
