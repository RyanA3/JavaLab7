/*
 * 
 * Ryan Alsobrooks
 * hl7878
 * Lab 07
 * 10-26-23
 * 
 */


import java.util.Scanner;

import menu.EchoCommand;
import menu.Menu;
import menu.MenuItem;

public class hl7878_Lab07 {

    public static void main(String[] args) {

        Menu menu = new Menu();

        MenuItem echoMenuItem = new MenuItem("echo", "Prints back what the user enters in a prompt", new EchoCommand());
        menu.addMenuItem(echoMenuItem);

        menu.begin(new Scanner(System.in));
        
    }

}
