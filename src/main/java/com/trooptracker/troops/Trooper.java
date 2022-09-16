package com.trooptracker.troops;

public class Trooper {

  private String name;
  private int num;
  private int percentage;

  public void troopers(String name, int num, int percentage) {
    this.name = name;
    this.num = num;
    this.percentage = percentage;
  }

  // These are the getters and setters for the trooper information
  /**
   * @return String return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @return int return the num
   */
  public int getNum() {
    return num;
  }

  /**
   * @return int return the percentage
   */
  public int getPercentage() {
    return percentage;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @param num the num to set
   */
  public void setNum(int num) {
    this.num = num;
  }

  /**
   * @param percentage the percentage to set
   */
  public void setPercentage(int percentage) {
    this.percentage = percentage;
  }

  // public String fullName;
  // public int id;

  // public User(String fullName, int id) {
  // this.fullName = fullName;
  // this.id = id;
  // }

  // public User(String tagName) {
  // }

  // public String getFullName() {
  // return fullName;
  // }

  // public void setFullName(String fullName) {
  // this.fullName = fullName;
  // }

  // public int getId() {
  // return id;
  // }

  // public void setId(int id) {
  // this.id = id;
  // }

  // public String toString() {
  // return id + ", " + fullName;
  // }
}
