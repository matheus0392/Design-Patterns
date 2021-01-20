package dev.msnascimento.observer;

import java.util.ArrayList;

public class SocialMediaFeed {

  private ArrayList<String> statuses = new ArrayList<>();

  public void printStatuses() {
    statuses.forEach(System.out::println);
  }

}
