package com.trooptracker.troops;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class AscNumber {

  public static List<Trooper> getNumAsc() {
    List<Trooper> ascList = new LinkedList<Trooper>();
    ascList.addAll(getUsers());
    ascList.sort((u1, u2) -> u1.getNum() - u2.getNum());
    return ascList;
  }

  private static Collection<? extends Trooper> getUsers() {
    return null;
  }
}
