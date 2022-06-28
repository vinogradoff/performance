package de.vinogradovit.performance;

import com.codeborne.selenide.Condition;
import io.cloudbeat.junit.CbJunitExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

@ExtendWith(CbJunitExtension.class)
public class SimpleTest {

  @Test
  void findSelenideOnGithub(){
    open("https://github.com");
    $("abc").shouldBe(visible);

  }
}
