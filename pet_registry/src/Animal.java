import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String nickname;
    private List<String> commands;

    public Animal(String nickname) {
        this.nickname = nickname;
        this.commands = new ArrayList<>();
    }

    public String getNickname() {
        return nickname;
    }

    public void addCommand(String command) {
        commands.add(command);
    }

    public void showCommands() {
        System.out.println("Команды для животного " + nickname + ":");
        for (String command: commands) {
            System.out.println("- " + command);
        }
    }

}
