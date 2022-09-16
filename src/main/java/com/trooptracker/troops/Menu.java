package com.trooptracker.troops;

import java.util.Scanner;

public class Menu {

  public static void menuRun() {

    System.out.println("\n" + "*************************" + "\n" + "**TROOP TRACKER DATA**" + "\n"
        + "*************************" + "\n");
    System.out.println("\n");
    System.out.println("Please enter the corresponding number to choose one of the following options:" + "\n"
        + "1 Show ID data in ascending order" + "\n" + "2 Show ID data in descending order " + "\n"
        + "3 Export data to PDF in ID ascending order " + "\n" + "4 Export data to PDF in ID descending order"
        + "\n" + "5 Exit");

    try (Scanner input = new Scanner(System.in)) {
      String menuchoice = input.nextLine();

      switch (menuchoice) {

        case "1":
          System.out.println(AscNumber.getNumAsc());
          System.out.println("\n");
          System.out.println("\n");
          menuRun();
          break;

        case "2":
          System.out.println(DescNumber.getNumDes());
          System.out.println("\n");
          System.out.println("\n");
          menuRun();
          break;

        case "3":
          System.out.println("GoodBye!");
          System.exit(0);

        default:
          System.out.println("Invalid Option! Please enter again");
      }
    }

  }
}
