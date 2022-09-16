package com.trooptracker.troops;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class DescNumber {

  public static List<Trooper> getNumDes() {
    List<Trooper> desList = new LinkedList<Trooper>();
    desList.addAll(getUsers());
    desList.sort((u1, u2) -> u2.getNum() - u1.getNum());

    return desList;
  }

  private static Collection<? extends Trooper> getUsers() {
    return null;
  }
}
