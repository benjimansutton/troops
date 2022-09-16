package com.trooptracker.troops;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.NodeList;

public class TrooperList {

  public static List<Trooper> getTrooperFromXML() {
    List<Trooper> troopers = new LinkedList<>();

    try {
      // locates the XML file
      Path filePath = Paths.get("src/main/resources/troops.xml");
      File file = new File(String.valueOf(filePath.toAbsolutePath()));

      if (file.exists()) {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = (Document) documentBuilder.parse(String.valueOf(filePath.toAbsolutePath()));

        // Gets the elements "Name" and "Numbers" from the troops.xml file and add them
        // to a node list
        NodeList[] user = { ((org.w3c.dom.Document) document).getElementsByTagName("name"),
            ((org.w3c.dom.Document) document).getElementsByTagName("number"),
            ((org.w3c.dom.Document) document).getElementsByTagName("percentage") };

        // For loop for getting the information from the node list and collect the
        // values "name" and "number"
        for (int i = 0; i < user[0].getLength(); i++) {
          String name = user[0].item(i).getTextContent();
          int number = Integer.parseInt(user[1].item(i).getTextContent());
          int percentage = Integer.parseInt(user[2].item(i).getTextContent());
          Trooper newTrooper = new Trooper();

          // Then add the new trooper to the trooper list
          troopers.add(newTrooper);
        }
      } else {
        System.out.println("File not found.");
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    // Returns the final set of troopers
    return troopers;
  }

  /**
   * 
   */
  public TrooperList() {
  }

}