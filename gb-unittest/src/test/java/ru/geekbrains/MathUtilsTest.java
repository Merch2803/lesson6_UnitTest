package ru.geekbrains;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class MathUtilsTest {

    @Test
    public void shouldDoSuccessfulOutputElementsAfterElementFour() {

        // 1 test
        int[] array = {1, 2, 4, 4, 2, 3, 4, 1, 7};

        Assertions.assertArrayEquals(new int[]{1, 7}, MathUtils.outputElementsAfterLastFour(array));


        // 2 test
        int[] array1 = {4, 5, 2, 4, 5, 6, 1, 1};

        Assertions.assertArrayEquals(new int[]{5, 6, 1, 1}, MathUtils.outputElementsAfterLastFour(array1));


        // 3 test
        int[] array2 = {4, 4, 4, 4, 4, 4};

        Assertions.assertArrayEquals(new int[]{}, MathUtils.outputElementsAfterLastFour(array2));


        // 4 test
        int[] array3 = {5, 1, 2, 2, 3, 3, 12, 14};

        Assertions.assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                MathUtils.outputElementsAfterLastFour(array3);
            }
        });

    }

    @Test
    public void shouldDoSuccessfulCheckingHasFourOrOne() {

        // 1 test
        int[] array = {2, 12, 3, 5, 4, 12};

        // тут будет зеленый тест, ибо array содержит 4 и мы ожидаем, что метод возвратит нам true;
        Assertions.assertArrayEquals(new boolean[]{true}, MathUtils.checkHasFourOrOneInArray(array));


        // 2 test
        int[] array1 = {2, 12, 1, 5, 51, 12};

        // тут будет зеленый тест, ибо array1 содержит 1 и мы ожидаем, что метод возвратит нам true;
        Assertions.assertArrayEquals(new boolean[]{true}, MathUtils.checkHasFourOrOneInArray(array1));


        // 3 test
        int[] array2 = {2, 12, 3, 4, 1, 12};

        // тут будет зеленый тест, ибо array2 содержит и 1, и 4 и мы ожидаем, что метод возвратит нам true;
        Assertions.assertArrayEquals(new boolean[]{true}, MathUtils.checkHasFourOrOneInArray(array2));


        // 4 test
        int[] array3 = {2, 12, 28, 11, 44, 12};

        // тут будет зеленый тест, ибо array3 содержит не содержит ни 1, ни 4 и мы ожидаем, что метод возвратит нам false;
        Assertions.assertArrayEquals(new boolean[]{false}, MathUtils.checkHasFourOrOneInArray(array3));

    }

}
