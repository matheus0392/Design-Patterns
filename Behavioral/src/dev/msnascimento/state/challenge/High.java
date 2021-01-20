package dev.msnascimento.state.challenge;

public class High implements State {

	@Override
	public void turnUp(Fan fan) {
		// TODO Auto-generated method stub

	}

	@Override
	public void turnDown(Fan fan) {
        fan.setState(new Medium());
        System.out.println("Fan is on medium");
	}

}
