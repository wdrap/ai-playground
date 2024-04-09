package dev.wdrap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomWords {
    private static final String[] WORDS = {"apple", "banana", "cherry", "date", "elderberry",
                                           "fig", "grape", "honeydew", "iceberg", "jackfruit",
                                           "kiwi", "lemon", "mango", "nectarine", "orange",
                                           "pineapple", "quince", "raspberry", "strawberry", "tangerine",
                                           "ugli", "victoria", "watermelon", "xigua", "yellow", "zucchini"};

    public static void main(String[] args) {
        List<String> randomWords = getRandomWords(10);
        System.out.println(randomWords);
    }

    private static List<String> getRandomWords(int count) {
        List<String> words = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            words.add(WORDS[random.nextInt(WORDS.length)]);
        }
        return words;
    }
}