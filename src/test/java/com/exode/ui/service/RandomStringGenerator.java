package com.exode.ui.service;

import java.util.Random;

public interface RandomStringGenerator {

    static String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomNumber = random.nextInt(97, 123);
            char randomChar = (char) randomNumber;
            sb.append(randomChar);
        }
        return sb.toString();
    }
}
