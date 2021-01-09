package dev.msnascimento.singleton;

public class PrintSpooler {

	private static PrintSpooler spooler;

	private static boolean initialized = false;

	// private default constructor
	private PrintSpooler() {
		System.out.println("creating PrintSpooler object");
	}

	private void init() {
		// custom init code
		System.out.println("init PrintSpooler object");
	}

	public static PrintSpooler getInstance() {

		if (initialized)
			return spooler;

		spooler = new PrintSpooler();
		spooler.init();
		initialized = true;

		return spooler;
	}

}
