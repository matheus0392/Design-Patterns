package dev.msnascimento.strategy;

public class RSAEncryptor implements Encryptor {

	@Override
	public String encryptFile() {
		return "Applying RSA encryption";
	}

}