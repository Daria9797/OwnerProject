import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

public class OstrovokTests  extends TestBase{
    MainPage main = new MainPage();

    @Test
    @DisplayName("В форме авторизации отображаются email,пароль,кнопка входа ")
    void formAvtorizationHasFields() {
            main.changeLang();
            main.checkFieldsAutorization();
    }
}
