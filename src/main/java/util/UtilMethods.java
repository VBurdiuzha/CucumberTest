package util;

import org.apache.commons.io.IOUtils;
import org.junit.Assert;

import java.io.IOException;

public class UtilMethods {
    public String getFile(String fileName) {
        StringBuilder result = new StringBuilder();
        ClassLoader classLoader = getClass().getClassLoader();
        try {
            result.append(IOUtils.toString(classLoader.getResourceAsStream(fileName)));
        } catch (NullPointerException e) {
            Assert.assertTrue(String.format("Cannot find file by path: %s", fileName),false);
        } catch (IOException e) {
            Assert.assertTrue(String.format("Cannot open file %s", fileName),false);
        }
        return result.toString();
    }
}
