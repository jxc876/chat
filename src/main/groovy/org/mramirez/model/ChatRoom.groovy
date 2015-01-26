package org.mramirez.model

import groovy.transform.ToString

import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToMany
import javax.persistence.OneToMany

@Entity
@ToString
class ChatRoom {

	@Id
	@GeneratedValue
	long id
	String roomName

	@ManyToMany
	Set<Member> members

	@OneToMany(mappedBy="room")
	List<Message> history
}
