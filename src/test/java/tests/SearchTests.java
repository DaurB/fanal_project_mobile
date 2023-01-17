package tests;

import io.appium.java_client.AppiumBy;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class SearchTests extends TestBase {

    @Owner("Bibol Dauren")
    @Test
    @DisplayName("Success search")
    void successSearchTest() {
        back();
        step("Type search", () -> {
            $(AppiumBy.accessibilityId("Search Wikipedia")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Python");
        });
        step("Verify content found", () ->
                $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(sizeGreaterThan(0)));
    }

    @Owner("Bibol Dauren")
    @Test
    @DisplayName("Open article")
    void openArticleTest() {
        back();
        step("Type search", () -> {
            $(AppiumBy.accessibilityId("Search Wikipedia")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Metallica");
        });
        step("Verify content found", () ->
                $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(sizeGreaterThan(0)));
        step("Choose page", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).click();
            back();
            $(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).click();
        });
        step("Verify opened page", () ->
                $(AppiumBy.className("android.webkit.WebView")).shouldHave(text("Metallica")));
    }

    @Owner("Bibol Dauren")
    @Test
    @DisplayName("Add language")
    void addLanguageTest() {
        back();
        step("Type search", () ->
                $(AppiumBy.accessibilityId("Search Wikipedia")).click());
        step("Add new language", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/search_lang_button")).click();
            $$(AppiumBy.id("org.wikipedia.alpha:id/wiki_language_title")).findBy(text("ADD LANGUAGE")).click();
            $$(AppiumBy.id("org.wikipedia.alpha:id/localized_language_name")).findBy(text("Deutsch")).click();
        });
        step("Verify added language", () ->
                $$(AppiumBy.className("android.widget.TextView")).findBy(text("Deutsch")).shouldBe(visible));
    }
}