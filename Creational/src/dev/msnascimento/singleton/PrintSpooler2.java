package dev.msnascimento.singleton;

public class PrintSpooler2 {

	private static final PrintSpooler2 spooler = new PrintSpooler2();

	private static boolean initialized = false;

	// private default constructor
	private PrintSpooler2() {
		System.out.println("creating PrintSpooler2 object");
	}

	private void init() {
		// custom init code
		System.out.println("init PrintSpooler2 object");
	}

	public static synchronized PrintSpooler2 getInstance() {

		if (initialized)
			return spooler;
		spooler.init();
		initialized = true;

		return spooler;
	}

}
