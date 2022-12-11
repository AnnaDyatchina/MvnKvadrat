package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


class SqrServiceTest {

    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/kvadratSCV")
    public void calcTest(int expected, int min, int max) {
        SqrService service = new SqrService();
        int actual = service.calc(min, max);

        Assertions.assertEquals(expected, actual);
    }
}



