package utils;

import com.codeborne.selenide.Screenshots;
import com.google.common.io.Files;
import ru.yandex.qatools.allure.annotations.Attachment;
import java.io.File;
import java.io.IOException;

/**
 * Класс для обработки ошибок и логгирования
 * Created by artem on 20.09.2017.
 */

public class AllureRuntime {

    public static void error(Exception e) throws IOException {
        attachScreenshot();
        attachLog(e);
    }

    @Attachment(value = "MessageAttachment", type = "text/plain")
    public static String attachLog(Exception e) throws IOException {
        return "Тест упал с ошибкой " + e + ": " + e.getMessage();
    }

    @Attachment(value = "ScreenshotAttachment", type = "image/png")
    public static byte[] attachScreenshot() throws IOException {
        File screenshot = Screenshots.takeScreenShotAsFile();
        return Files.toByteArray(screenshot);
    }

    public static void clearScreenshotList() {
        Screenshots.screenshots.getScreenshots().clear();
    }
}