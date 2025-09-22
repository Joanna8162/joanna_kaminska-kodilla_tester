package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.api.DisplayName;
import java.nio.file.*;
import java.io.IOException;
import java.util.*;
import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GamblingMachineTestSuiteII {

    private final GamblingMachine machine = new GamblingMachine();

    // --- providers ---
    static Stream<Arguments> validNumbers() throws IOException {
        return rowsByType("VALID");
    }

    static Stream<Arguments> invalidNumbers() throws IOException {
        return rowsByType("INVALID");
    }

    private static Stream<Arguments> rowsByType(String wanted) throws IOException {
        Path p = Paths.get("C:\\Users\\Joanna\\Desktop\\Testowanie\\Kurs\\Projekt\\kodilla-course\\kodilla-advanced-tests\\src\\main\\resources\\GamblingMachineAllSets.csv");
        return Files.lines(p)
                .skip(1)                                // pomiń nagłówek
                .map(line -> line.split(";", 2))
                .filter(cols -> cols[0].equalsIgnoreCase(wanted))
                .map(cols -> Arguments.of(parseNumbers(cols[1])));
    }

    private static Set<Integer> parseNumbers(String spaceSeparated) {
        return Arrays.stream(spaceSeparated.trim().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
    }

    // --- tests ---
    @ParameterizedTest(name = "[{index}] valid -> {0}")
    @MethodSource("validNumbers")
    @DisplayName("Powinno działać dla poprawnych zestawów")
    void shouldWorkForValid(Set<Integer> input) throws InvalidNumbersException {
        int hits = machine.howManyWins(input);
        // asercja przykładowa – ważne, że NIE ma wyjątku
        assertTrue(hits >= 0 && hits <= 6);
    }

    @ParameterizedTest(name = "[{index}] invalid -> {0}")
    @MethodSource("invalidNumbers")
    @DisplayName("Powinno rzucać wyjątek dla niepoprawnych zestawów")
    void shouldThrowForInvalid(Set<Integer> input) {
        assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(input));
    }
}