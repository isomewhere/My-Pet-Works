
import org.aeonbits.owner.Config;

@Config.Sources("classpath:config.properties")

public interface ProjectConfig extends Config {
  @Key("BASE_URL")
    String baseUrl();
}
