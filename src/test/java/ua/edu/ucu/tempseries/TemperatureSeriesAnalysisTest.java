package ua.edu.ucu.tempseries;

import static org.junit.Assert.*;
import org.junit.Test;

public class TemperatureSeriesAnalysisTest {

    @Test
    public void testAverageWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysis.average();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAverageWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.average();
    }

    @Test
    public void testAverage() {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 1.0;

        double actualResult = seriesAnalysis.average();

        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testDeviationWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-6.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 0.0;

        // call tested method
        double actualResult = seriesAnalysis.deviation();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeviationWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.deviation();
    }

    @Test
    public void testDeviation() {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis
                = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 3.7416573867739;

        double actualResult = seriesAnalysis.deviation();

        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testMinWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-8.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -8.0;

        // call tested method
        double actualResult = seriesAnalysis.min();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.average();
    }

    @Test
    public void testMin() {
        double[] temperatureSeries = {9.0, -5.0, 1.0, 9.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -5.0;

        double actualResult = seriesAnalysis.min();

        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testMaxWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {9.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 9.0;

        // call tested method
        double actualResult = seriesAnalysis.max();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.max();
    }

    @Test
    public void testMax() {
        double[] temperatureSeries = {29.0, -5.0, 9.0, 2.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 29.0;

        double actualResult = seriesAnalysis.max();

        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testFindTempClosestToZeroWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysis.findTempClosestToZero();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindTempClosestToZeroWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.findTempClosestToZero();
    }

    @Test
    public void testFindTempClosestToZero() {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 1.0;

        double actualResult = seriesAnalysis.findTempClosestToZero();

        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testFindTempClosestToValueWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-9.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -9.0;

        // call tested method
        double actualResult = seriesAnalysis.findTempClosestToValue(1.7);

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindTempClosestToValueWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.findTempClosestToValue(1.7);
    }

    @Test
    public void testFindTempClosestToValue() {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 1.0;

        double actualResult = seriesAnalysis.findTempClosestToValue(1.7);

        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testFindTempsLessThenWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-9.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double [] expectedArray = {-9.0};

        // call tested method
        double[] actualArray = seriesAnalysis.findTempsLessThen(1.0);
        assertArrayEquals(expectedArray, actualArray, 0.000001);
    }

    @Test
    public void testFindTempsLessThenWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);

        double [] expectedArray = {};

        // call tested method
        double[] actualArray = seriesAnalysis.findTempsLessThen(1.0);

        assertArrayEquals(expectedArray, actualArray, 0.0001);
    }

    @Test
    public void testFindTempsLess() {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);

        double [] expectedArray = {-5.0, 1.0};

        // call tested method
        double[] actualArray = seriesAnalysis.findTempsLessThen(1.7);


        assertArrayEquals(expectedArray, actualArray, 0.0001);
    }

    @Test
    public void testFindTempsGreaterThenWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-9.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double [] expectedArray = {};

        // call tested method
        double[] actualArray = seriesAnalysis.findTempsGreaterThen(1.0);
        assertArrayEquals(expectedArray, actualArray, 0.000001);
    }

    @Test
    public void testFindTempsGreaterThenWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);

        double [] expectedArray = {};

        // call tested method
        double[] actualArray = seriesAnalysis.findTempsGreaterThen(1.0);

        assertArrayEquals(expectedArray, actualArray, 0.00001);
    }

    @Test
    public void testFindTempsGreater() {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);

        double [] expectedArray = {3.0, 5.0};

        // call tested method
        double[] actualArray = seriesAnalysis.findTempsGreaterThen(1.7);

        assertArrayEquals(expectedArray, actualArray, 0.00001);
    }

    @Test
    public void testTempSummaryStatisticsWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {2.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double expectedAverage = 2.0;
        double expectedDev = 0.0;
        double expectedMin = 2.0;
        double expectedMax = 2.0;


        // call tested method
        TempSummaryStatistics statistics = seriesAnalysis.summaryStatistics();
        double actualAverage = statistics.getAverage();
        double actualDev = statistics.getDevTemp();
        double actualMin = statistics.getMinTemp();
        double actualMax = statistics.getMaxTemp();

        assertEquals(expectedAverage, actualAverage, 0.000001);
        assertEquals(expectedDev, actualDev, 0.000001);
        assertEquals(expectedMin, actualMin, 0.000001);
        assertEquals(expectedMax, actualMax, 0.000001);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testTempSummaryStatisticsWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.summaryStatistics();
    }

    @Test
    public void testTempSummaryStatistics() {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0, 8.5};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);

        double expectedAverage = 2.5;
        double expectedDev = 4.494441010848846;
        double expectedMin = -5.0;
        double expectedMax = 8.5;


        // call tested method
        TempSummaryStatistics statistics = seriesAnalysis.summaryStatistics();
        double actualAverage = statistics.getAverage();
        double actualDev = statistics.getDevTemp();
        double actualMin = statistics.getMinTemp();
        double actualMax = statistics.getMaxTemp();

        assertEquals(expectedAverage, actualAverage, 0.000001);
        assertEquals(expectedDev, actualDev, 0.000001);
        assertEquals(expectedMin, actualMin, 0.000001);
        assertEquals(expectedMax, actualMax, 0.000001);
    }

    @Test
    public void testAddTempsWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        int expResult = 3;

        // call tested method
        int actualResult = seriesAnalysis.addTemps(0.1, 9);

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testAddTempsWithEmptyArray() {
        // setup input data and expected result
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        int expResult = 1;

        // call tested method
        int actualResult = seriesAnalysis.addTemps(0.1);

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testAddTemps() {
        // setup input data and expected result
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        int expResult = 6;

        int actualResult = seriesAnalysis.addTemps(6, 8.9);

        assertEquals(expResult, actualResult, 0.00001);
    }

}
