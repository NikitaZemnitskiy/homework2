package com.Alevel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MultiplicityTest {

    @Test
    void testReturnsMultiplicityValueNonEmptyArrayOfIntegers() {
        int [] arr = {1,-10,34,-92,12,15,34,-915};
        int [] expected = Multiplicity.Mult(arr,5);
        int [] actual = {-10, 15, -915};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testReturnsMultiplicityZeroNonEmptyArrayOfIntegers() {
        int [] arr = {1,-10,34,-92,12,15,34,-915};
        int [] expected = Multiplicity.Mult(arr,0);
        assertNull(expected);
    }

    @Test
    void testReturnsMultiplicityZeroArrayOfIntegers() {
        int [] arr = {1,-10,34,-92,12,15,34,-915};
        int [] expected = Multiplicity.Mult(arr,999);
        int [] actual = {};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testReturnsMultiplicityValueNullArray() {
        int [] arr = null;
        int [] expected = Multiplicity.Mult(arr,0);
        int [] actual = null;
        assertArrayEquals(expected, actual);
    }
    @Test
    void testReturnsMultiplicityValueEmptyArray() {
        int [] arr = {};
        int [] expected = Multiplicity.Mult(arr,5);
        int [] actual = arr;
        assertArrayEquals(expected, actual);
    }

}
