package alisson.configurationProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "sender")
public class Sender {

    private String name;
    private String email;
    private List<Long> cellphones;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Long> getCellphones() {
        return cellphones;
    }

    public void setCellphones(List<Long> cellphones) {
        this.cellphones = cellphones;
    }
}
