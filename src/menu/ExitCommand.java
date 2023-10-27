package menu;

import java.util.ArrayList;
import java.util.Scanner;
import prompt.Prompt;

public class ExitCommand implements MenuCommand {

    private Menu menu;
    private Prompt exitConfirmPrompt = new Prompt().pstr("Are you sure you want to exit? (Y/n)");

    public ExitCommand(Menu menu) {
        this.menu = menu;
    }

    public void execute(Scanner in) {
        ArrayList<String> args = exitConfirmPrompt.go(in);
        if(args == null || args.size() < 1) return;
        if(!args.get(0).equalsIgnoreCase("y") && !args.get(0).equalsIgnoreCase("yes")) return;
        menu.quit();
    }
    
}
