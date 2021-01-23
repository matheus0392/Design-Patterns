package dev.msnascimento.template.challenge;

public abstract class Character {

	public abstract void pickUpWeapon();

	public abstract void defenseAction();

	public abstract void moveToSafety();

	public void defendAgainstAttack() {
		pickUpWeapon();
		defenseAction();
		moveToSafety();
		System.out.println();
	}
}
