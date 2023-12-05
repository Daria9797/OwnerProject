package pages;
import components.MenuComponent;

import static com.codeborne.selenide.Condition.*;;

public class MainPage {

    MenuComponent menu = new MenuComponent();

    public void changeLang() {
        menu.changeLanguage("Русский");
    }

    public void checkFieldsAutorization() {

        menu.openFormAvtorization();
        menu.fieldEmail.shouldBe(exist, visible);
        menu.fieldPassword.shouldBe(exist, visible);
        menu.buttonAvtorization.shouldBe(exist, visible);

    }
}
