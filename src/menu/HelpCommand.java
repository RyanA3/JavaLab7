package menu;

import java.util.Scanner;

public class HelpCommand implements MenuCommand {

    private Menu menu;

    public HelpCommand(Menu menu) {
        this.menu = menu;
    }

    public void execute(Scanner in) {
        System.out.println("\n== Help ==");
        MenuItem[] items = menu.getMenuItems();
        for(int i = 0; i < menu.getNumMenuItems(); i++) {
            System.out.println(items[i].getKey() + ": " + items[i].getDescription());
        }
    }
    
}
