package com.Alevel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortTest {

    final static Integer [] expected = {-914,-92,-10,0,1,17,34,34};
    final static String [] expectedStrings = {"a","b","c","d","e","f","z"};
    final static Integer [] expectedWithOneNull = {null,-1,1,5};
    final static Integer [] expectedWithNull = {null,null,null,null};
    final static Float [] expectedFloat = {Float.NEGATIVE_INFINITY,0.0f,1.4E-45f,66666.666666f,3.4028235E38f,Float.POSITIVE_INFINITY,Float.NaN};
    final static Integer [] expectedEmpty = new Integer[0];
    final static Integer [] expectedMaxAndMinValue = {-2147483648, -2147483647, 2147483646, 2147483647};
    final static Boolean [] expectedBoolean = {null, false, false, false,false, true,true,true};

    @Test
    void testSortNonEmptyArrayOfIntegersReturnsSortedArray() {
        Integer [] arr = {1,-10,34,-92,0,17,34,-914};
        Integer [] actual = BubbleSort.sort(arr);
        assertArrayEquals(expected, actual);

    }

    @Test
    void testSortNonEmptyArrayOfStringsReturnsSortedArray() {
        String [] StringArr = {"a","b","d","c","f","z","e"};
        String [] actual = BubbleSort.sort(StringArr);
        assertArrayEquals(expectedStrings, actual);

    }

    @Test
    void testSortNonEmptyArrayOfFloatReturnsSortedArray() {
        Float [] FloatArr = {Float.NaN,Float.MAX_VALUE,Float.MIN_VALUE,0.0f,Float.NEGATIVE_INFINITY,Float.POSITIVE_INFINITY, 66666.666666f};
        Float [] actual = BubbleSort.sort(FloatArr);
        assertArrayEquals(expectedFloat, actual);

    }
    @Test

    void testArraySortWithOneNullReturnSortedArray() {
        Integer[] arrWithOneNull = {1,null,5,-1};
        Comparable [] actual = BubbleSort.sort(arrWithOneNull);
        assertArrayEquals(expectedWithOneNull, actual);
    }

    @Test

    void testArraySortWithNullReturnSortedArray() {
        Integer[] arrWithNull = {null,null,null,null};
        Comparable [] actual = BubbleSort.sort(arrWithNull);
        assertArrayEquals(expectedWithNull, actual);
    }

    @Test

    void testArraySortWithMaxAndMinValueRetunSortedArray() {
        Integer[] arrWithMaxAndMinValue = {Integer.MAX_VALUE,Integer.MIN_VALUE,Integer.MAX_VALUE+2,Integer.MIN_VALUE-2};
        Comparable [] actual = BubbleSort.sort(arrWithMaxAndMinValue);
        assertArrayEquals(expectedMaxAndMinValue, actual);
    }

    @Test
    void testSortEmptyArray() {
        Integer [] actual = BubbleSort.sort(new Integer[0]);
        assertArrayEquals(expectedEmpty, actual);
    }

    @Test
    void testSortNonEmptyArrayOfBooleanReturnsSortedArray() {
        Boolean[] arr = {true, false, false, null, 1 > 2, 2 > 1, false, true};
        Boolean[] actual = BubbleSort.sort(arr);
        assertArrayEquals(expectedBoolean, actual);
    }

}