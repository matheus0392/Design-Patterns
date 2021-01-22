package dev.msnascimento.strategy;

public class Main {

	public static void main(String[] args) {
		File file = new File("test.pdf");
		Encryptor aesEncryptor = () -> "Applying AES encryption";
		file.encrypt(Encryptor.aesEncryptor);
	}

}
