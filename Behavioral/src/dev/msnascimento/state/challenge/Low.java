package dev.msnascimento.state.challenge;

public class Low implements State {

	@Override
	public void turnUp(Fan fan) {
		fan.setState(new Medium());
		System.out.println("Fan is on medium");
	}

	@Override
	public void turnDown(Fan fan) {
		// TODO Auto-generated method stub
	}

}
