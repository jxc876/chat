package org.mramirez.model

import javax.persistence.Entity;
import javax.persistence.GeneratedValue
import javax.persistence.Id

import org.hibernate.annotations.Type

@Entity
class Message {
	
	@Id
	@GeneratedValue
	long id
	
	@Type(type="encryptedString")
	String text
}
