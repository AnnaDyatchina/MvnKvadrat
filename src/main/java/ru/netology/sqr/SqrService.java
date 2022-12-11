package ru.netology.sqr;

public class SqrService {

    public int calc(int min, int max) {
        int counter = 0;
        for (int i = 10; i < 99; i++) {
            if (i * i >= min) {
                if (i * i <= max) {
                    counter++;

                }
            }

        }
        return counter;
    }
}
