package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {

    @Test
    @Description("Smoke test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://marstech.tb.ru/'", () ->
                open("https://marstech.tb.ru/"));

        step("Page title should have text 'MarsTech'", () -> {
            String expectedTitle = "MarsTech";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Smoke test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://marstech.tb.ru/'", () ->
                open("https://marstech.tb.ru/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }

    @Test
    @Description("Smoke test")
    @DisplayName("Main page should have tabs")
    void mainPageShouldHaveTabsTest() {
        step("Open url 'https://marstech.tb.ru/'", () ->
                open("https://marstech.tb.ru/"));

        step("Get tab elements", () -> {
            $("[href='#about']").shouldBe(visible);
            $("[href='#services']").shouldBe(visible);
            $("[href='#advantages']").shouldBe(visible);
            $("[href='#contacts']").shouldBe(visible);
            $("[href='https://marstech.tb.ru/mstandwwf']").shouldBe(visible);
        });
    }

    @Test
    @Description("Smoke test")
    @DisplayName("Moving an about tab to the desired section")
    void movingAnAboutTabToTheDesiredSection() {
        step("Open url 'https://marstech.tb.ru/'", () ->
                open("https://marstech.tb.ru/"));

        step("Tab relocation and text verification", () -> {
            $("[href='#about']").click();
            $("h2").$(byText("О компании"));
        });
    }

    @Test
    @Description("Smoke test")
    @DisplayName("Moving a services tab to the desired section")
    void movingAServicesTabToTheDesiredSection() {
        step("Open url 'https://marstech.tb.ru/'", () ->
                open("https://marstech.tb.ru/"));

        step("Tab relocation and text verification", () -> {
            $("[href='#services']").click();
            $("h2").$(byText("Предлагаемые услуги"));
        });
    }

    @Test
    @Description("Smoke test")
    @DisplayName("Moving an advantages tab to the desired section")
    void movingAnAdvantagesTabToTheDesiredSection() {
        step("Open url 'https://marstech.tb.ru/'", () ->
                open("https://marstech.tb.ru/"));

        step("Tab relocation and text verification", () -> {
            $("[href='#advantages']").click();
            $("h2").$(byText("Ваша выгода"));
        });
    }

    @Test
    @Description("Smoke test")
    @DisplayName("Moving a contacts tab to the desired section")
    void movingAContactsTabToTheDesiredSection() {
        step("Open url 'https://marstech.tb.ru/'", () ->
                open("https://marstech.tb.ru/"));

        step("Tab relocation and text verification", () -> {
            $("[href='#contacts']").click();
            $("h3").$(byText("Контакты"));
        });
    }

    @Test
    @Description("Smoke test")
    @DisplayName("Moving a wwf tab to the desired section")
    void movingAWwfTabToTheDesiredSection() {
        step("Open url 'https://marstech.tb.ru/'", () ->
                open("https://marstech.tb.ru/"));

        step("Tab relocation and text verification", () -> {
            $("a[href='https://marstech.tb.ru/mstandwwf']").click();
            $("h1").$(byText("MST и WWF"));
        });
    }
}