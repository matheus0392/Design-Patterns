package dev.msnascimento.observer.challenge;

public class Main {

  public static void main(String[] args) {
    City sunnyville = new City();
    City springfield = new City();
    TrafficUpdates trafficUpdates = new TrafficUpdates();
    
    sunnyville.setPropertyChangeListener(trafficUpdates);
    springfield.setPropertyChangeListener(trafficUpdates);

    sunnyville.updateTraffic("Congestion in town center");
    springfield.updateTraffic("Accident on the highway");

    trafficUpdates.getUpdates();

  }


}
