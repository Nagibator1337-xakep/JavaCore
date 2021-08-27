package helpers;

import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;

public class TestObjectGenerator {
    private static Faker faker = new Faker();

    public static String randomString(int length) {
        if (length < 4 || length > 30) throw new IllegalArgumentException("String length "+ length + " is out of range, should be 4 to 30.");
        return RandomStringUtils.random(length-3, true, false) + index();
    }

    public static String randomFakerString() {
        return faker.ancient().hero() + "_" + faker.nation().capitalCity() + index();
    }

    private static String index() {
        int index = (int) (Math.random() * 100);    // Creating random number 0-100
        return "_" + index;
    }
}
