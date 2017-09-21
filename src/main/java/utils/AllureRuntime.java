package utils;

import ru.yandex.qatools.allure.annotations.Attachment;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by artem on 20.09.2017.
 */
public class AllureRuntime {

    public static void error(Exception exceptionName) throws IOException {
        attachImage();
        attachLog(exceptionName);
    }

    @Attachment(value = "ScreenshotAttachment", type = "image/jpg")
    public static byte[] attachImage() {
        return imageCapture();
    }

    @Attachment(value = "MessageAttachment", type = "text/plain")
    public static String attachLog(Exception e) throws IOException {
        return "Тест упал с ошибкой " + e + ": " + e.getMessage();
    }

    private static byte[] imageCapture() {
        byte[] bytesArray = null;
        try {
            BufferedImage bufferedImage = new Robot().createScreenCapture(
                    new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();
            ImageIO.write(bufferedImage, "jpg", byteOutput);
            bytesArray = byteOutput.toByteArray();
        } catch (AWTException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bytesArray;
    }
}
