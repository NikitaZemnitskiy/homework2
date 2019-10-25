package com.Alevel;

import org.junit.Assert;
import org.junit.Test;


class MinMaxArrTest {



    @Test
    void testReturnsMinValueNonEmptyArrayOfIntegers() {
        Integer [] arr = {11, -3, 14, 0, 9};
        Integer actual = MinMaxArr.MinArr(arr);
        Integer expected = -3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    void testReturnsMaxValueNonEmptyArrayOfIntegers() {
        Integer [] arr = {11, -3, 14, 0, 9};
        Integer actual = MinMaxArr.MaxArr(arr);
        Integer expected = 14;
        Assert.assertEquals(expected, actual);
    }

    @Test
    void testReturnsMinValueArrayWithNull() {
        Integer [] arr = {null, -3, 14, 0, null};
        Integer actual = MinMaxArr.MinArr(arr);
        Integer expected = null;
        Assert.assertEquals(expected, actual);
    }

    @Test
    void testReturnsMaxValueArrayWithNull() {
        Integer [] arr = {null, -3, 14, 0, null};
        Integer actual = MinMaxArr.MaxArr(arr);
        Integer expected = 14;
        Assert.assertEquals(expected, actual);
    }

    @Test
    void testReturnsMaxValueEmptyArray() {
        Integer [] arr = new Integer [0];
        Integer actual = MinMaxArr.MaxArr(arr);
        Integer expected = null;
        Assert.assertEquals(expected, actual);
    }

    @Test
    void testReturnsMinValueEmptyArray() {
        Integer [] arr = new Integer [0];
        Integer actual = MinMaxArr.MinArr(arr);
        Integer expected = null;
        Assert.assertEquals(expected, actual);
    }

    @Test
    void testReturnsMaxValueNonEmptyArrayOfStrings() {
        String [] arr = {"С", "л", "а", "в", "а"," ", "У","к","р","а","ї","н","і","!"};
        String actual = MinMaxArr.MaxArr(arr);
        String expected = "ї";
        Assert.assertEquals(expected, actual);
    }

    @Test
    void testReturnsMinValueNonEmptyArrayOfStrings() {
        String [] arr = {"С", "л", "а", "в", "а"," ", "У","к","р","а","ї","н","і","!"};
        String actual = MinMaxArr.MinArr(arr);
        String expected = " ";
        Assert.assertEquals(expected, actual);
    }

    @Test
    void testReturnsMinValueNonEmptyArrayOfFloat() {
        Float [] arr = {0f, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NaN};
        Float actual = MinMaxArr.MinArr(arr);
        Float expected = Float.NEGATIVE_INFINITY;
        Assert.assertEquals(expected, actual);
    }

    @Test
    void testReturnsMaxValueNonEmptyArrayOfFloat() {
        Float [] arr = {0f, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NaN};
        Float actual = MinMaxArr.MaxArr(arr);
        Float expected = Float.NaN;
        Assert.assertEquals(expected, actual);
    }

    @Test
    void testReturnsMaxValueNonEmptyArrayOfBoolean() {
        Boolean [] arr = {true, false, 1==2, 2/3==1};
        Boolean actual = MinMaxArr.MaxArr(arr);
        Boolean expected = true;
        Assert.assertEquals(expected, actual);
    }

    @Test
    void testReturnsMinValueNonEmptyArrayOfBoolean() {
        Boolean [] arr = {true, false, 1==2, 2/3==1};
        Boolean actual = MinMaxArr.MinArr(arr);
        Boolean expected = false;
        Assert.assertEquals(expected, actual);
    }

    @Test
    void testReturnsMinValueNonEmptyArrayOfNull() {
        Boolean [] arr = {null,null,null,null,null,null};
        Boolean actual = MinMaxArr.MinArr(arr);
        Boolean expected = null;
        Assert.assertEquals(expected, actual);
    }

    @Test
    void testReturnsMaxValueNonEmptyArrayOfNull() {
        Boolean [] arr = {null,null,null,null,null,null};
        Boolean actual = MinMaxArr.MaxArr(arr);
        Boolean expected = null;
        Assert.assertEquals(expected, actual);
    }








}