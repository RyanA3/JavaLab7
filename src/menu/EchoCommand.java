package menu;
import java.util.ArrayList;
import java.util.Scanner;
import prompt.Prompt;

public class EchoCommand implements MenuCommand {

    private Prompt echoPrompt = new Prompt().pstr("echoValue");

    public void execute(Scanner in) {
        ArrayList<String> args = echoPrompt.go(in);

        for(String s : args) {
            System.out.print(s + " ");
            System.out.println();
        }
    }
    
}
