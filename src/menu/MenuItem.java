package menu;

import java.util.Scanner;

public class MenuItem {
    
    private static int GID = 0;

    private MenuCommand command;
    private String key;
    private String description;
    private int ID = ++GID;

    /*
     * MenuItems
     * Creates a new menu option
     * 
     * Params
     * String key - the key that is used to select this option in the menu
     * String description - the help description displayed to the user that describes the function of this command
     * MenuCommand command - the command that is executed with the data obtained from the prompt
     *  
     * Author Ryan Alsobrooks
     * Author ID hl7878
     * Author Date 10-26-23
     */
    public MenuItem(String key, String description, MenuCommand executable) {
        this.key = key;
        this.description = description;
        this.command = executable;
    }

    /*
     * executeIfCalled
     * Executes this menu option if the string input is matching this menu item's key
     * 
     * Params
     * Scanner in - the input source for the prompting process
     * String key - the key that is used to select this option in the menu
     * 
     * Returns
     * true if executed
     *  
     * Author Ryan Alsobrooks
     * Author ID hl7878
     * Author Date 10-26-23
     */
    public boolean executeIfCalled(Scanner in, String cmd) {
        if(cmd.equalsIgnoreCase(key)) {
            command.execute(in);
            return true;
        }
        return false;
    }

    /*
     * getKey
     * returns the key used to select this menu item
     * 
     * Returns
     * String key - the key used to select this menu item
     *  
     * Author Ryan Alsobrooks
     * Author ID hl7878
     * Author Date 10-26-23
     */
    public String getKey() {
        return key;
    }

     /*
     * getDescription
     * returns a short description of what this menu item does
     * 
     * Returns
     * String description - a short description of what this menu item does
     *  
     * Author Ryan Alsobrooks
     * Author ID hl7878
     * Author Date 10-26-23
     */
    public String getDescription() {
        return description;
    }

     /*
     * getID
     * returns a unique identifier for this menu item
     * 
     * Returns
     * int ID - a unique identifier for this menu item
     *  
     * Author Ryan Alsobrooks
     * Author ID hl7878
     * Author Date 10-26-23
     */
    public int getID() {
        return ID;
    }

}
