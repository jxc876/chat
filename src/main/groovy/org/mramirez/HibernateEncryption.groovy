package org.mramirez

import javax.annotation.PostConstruct

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor
import org.jasypt.hibernate4.encryptor.HibernatePBEEncryptorRegistry
import org.springframework.context.annotation.Configuration

@Configuration
class HibernateEncryption {
	
	@PostConstruct
	public static void init() {
		StandardPBEStringEncryptor strongEncryptor = new StandardPBEStringEncryptor();
		strongEncryptor.setPassword("password");

		HibernatePBEEncryptorRegistry registry =
				HibernatePBEEncryptorRegistry.getInstance();
		registry.registerPBEStringEncryptor("STRING_ENCRYPTOR", strongEncryptor);
	}

}
