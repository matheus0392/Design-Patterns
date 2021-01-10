package dev.msnascimento.adapter.challenge;

public class Adapter implements City {

	private AsianCity city;

	public Adapter(AsianCity city) {
		this.city = city;
	}

	@Override
	public String getName() {
		return this.city.getName();
	}

	@Override
	public double getTemperature() {
		return this.city.getTemperature() * 9 / 5 + 32;
	}

	@Override
	public String getTemperatureScale() {
		return "Fahrenheit";//this.city.getTemperatureScale();
	}

	@Override
	public boolean getHasWeatherWarning() {
		return this.city.getHasWeatherWarning();
	}

	@Override
	public void setHasWeatherWarning(boolean hasWeatherWarning) {
		this.city.setHasWeatherWarning(hasWeatherWarning);
	}

}
