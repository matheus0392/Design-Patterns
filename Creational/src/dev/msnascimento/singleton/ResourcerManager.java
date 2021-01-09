package dev.msnascimento.singleton;

public class ResourcerManager {

	public static void main(String[] args) {

		PrintSpooler.getInstance();
		PrintSpooler.getInstance();
		PrintSpooler.getInstance();
		PrintSpooler.getInstance();

		// First thread
		Thread threadOne = new Thread(() -> {
			PrintSpooler2 s = PrintSpooler2.getInstance();
		});

		// Second thread
		Thread threadTwo = new Thread(() -> {
			PrintSpooler2 s = PrintSpooler2.getInstance();
		});

		threadOne.start();
		threadTwo.start();
	}

}
