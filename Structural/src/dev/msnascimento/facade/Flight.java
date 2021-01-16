package dev.msnascimento.facade;

import java.time.LocalDate;

public class Flight {

	public void bookOutwordJourney(LocalDate start) {
		System.out.println("Outbound flight booked for " + start);
	}

	public void bookReturnJourney(LocalDate end) {
		System.out.println("Return flight booked for " + end);
	}

}
