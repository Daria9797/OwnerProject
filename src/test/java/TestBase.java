import com.codeborne.selenide.Configuration;
import config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        WebConfig webConfig = ConfigFactory.create(WebConfig.class, System.getProperties());
        Configuration.baseUrl = "https://ostrovok.ru";
        Configuration.pageLoadStrategy = "eager";
        Configuration.browser = webConfig.getBrowserName();
        Configuration.browserVersion = webConfig.getBrowserVersion();
        Configuration.remote = webConfig.getRemoteUrl();

    }
    @BeforeEach
    void openResourse(){
        open("/");
    }
}
