package dev.msnascimento.observer;

public class Main {

  public static void main(String[] args) {
    Connection sally = new Connection();
    Connection bob = new Connection();
    SocialMediaFeed feed = new SocialMediaFeed();

    sally.setStatus("going for a walk");
    bob.setStatus("eating my lunch");

    feed.printStatuses();
  }


}
