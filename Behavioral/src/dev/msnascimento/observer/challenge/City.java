package dev.msnascimento.observer.challenge;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class City {

	private String trafficUpdate = "";
	private PropertyChangeSupport support = new PropertyChangeSupport(this);

	public void updateTraffic(String trafficUpdate) {
		support.firePropertyChange("trafficUpdate", this.trafficUpdate, trafficUpdate);
		this.trafficUpdate = trafficUpdate;
	}

	public void setPropertyChangeListener(PropertyChangeListener listener) {
		support.addPropertyChangeListener(listener);
	}

}
