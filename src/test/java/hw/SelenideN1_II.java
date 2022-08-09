package hw;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;


public class SelenideN1_II {


    @Test
    void sn1HwTest1() {
         /* 1. На главной странице GitHub выберите меню Pricing
          Убедитесь что загрузилась нужная страница (например что заголовок - "Choose the plan that’s right for you."
         -> Compare Plans с помощью команды hover для Pricing.
          Убедитесь что загрузилась нужная страница (например что заголовок - "Choose the plan that’s right for you."
         */

        open("https://github.com/");
        $("nav[aria-label=Global]").find(byText("Pricing")).hover();
        $(".HeaderMenu").$(byText("Compare plans")).click();
        $("h1.h2-mktg").shouldHave(Condition.text("Choose the plan that’s right for you."));
        String expectedUrl = "https://github.com/pricing#compare-features";
        webdriver().shouldHave(url(expectedUrl));

    }
}
