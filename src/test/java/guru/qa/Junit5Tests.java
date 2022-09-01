package guru.qa;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.open;

public class Junit5Tests {

    @BeforeAll
    static void initDB() {
        System.out.println("### @BeforeAll");
    }

    @BeforeEach
    void openYaPage() {
        System.out.println("###      @BeforeEach");
        //open("https://ya.ru");
    }

    @AfterEach()
    void closePage() {
            System.out.println("###      @AfterEach");
            //WebDriverRunner.closeWindow();
        }

    @AfterAll()
    static void cleanDB() {
        System.out.println("### @AfterAll");
    }

    @Test
    void assertTest1() {
        //Assertions.assertTrue(2 > 3);
        //open("https://ya.ru");
        //WebDriverRunner.closeWindow();
        System.out.println("###                 Test1");
    }

    @Test
    void assertTest2() {
        //Assertions.assertTrue(2 < 3);
        //open("https://ya.ru");
        //WebDriverRunner.closeWindow();
        System.out.println("###                 Test2");
    }
}
