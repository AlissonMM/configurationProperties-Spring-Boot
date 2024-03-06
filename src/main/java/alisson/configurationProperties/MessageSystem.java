package alisson.configurationProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageSystem implements CommandLineRunner {
    @Autowired
    private Sender sender;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Message send by: \n" + sender.getName() + "\n Email:" +
                sender.getEmail() + "\n Cellphones: " + sender.getCellphones());
    }
}
