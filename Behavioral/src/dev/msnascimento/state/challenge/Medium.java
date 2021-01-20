package dev.msnascimento.state.challenge;

public class Medium implements State {


	@Override
	public void turnUp(Fan fan) {
		fan.setState(new High());
        System.out.println("Fan is on high");
	}

	@Override
	public void turnDown(Fan fan) {
		fan.setState(new Low());
        System.out.println("Fan is on low");
	}

}
