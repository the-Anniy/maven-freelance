package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class FreelanceServiceTest {


    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/test_data.csv")
    public void shouldCalculateParamTest(int income, int expenses, int threshold, int expected) {
        FreelanceService service = new FreelanceService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}