package com.kodilla.testing.weather.stub;


import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverage() {
        double sum = 0;

        for (Double temperature : temperatures.getTemperatures().values()) {
            sum = sum + temperature;
        }
        return sum / temperatures.getTemperatures().size();
    }

    public double calculateMedian() {
        List<Double> sortedTemperatures = new ArrayList<>(temperatures.getTemperatures().values());
        Collections.sort(sortedTemperatures);
        return sortedTemperatures.get(sortedTemperatures.size() / 2);
    }

    public double calculateMax() {
        List<Double> maxTemperatures = new ArrayList<>(temperatures.getTemperatures().values());
        double max = maxTemperatures.get(0);
        int n = maxTemperatures.size();
        for (int i = 1; i < n; i++) {
            if (maxTemperatures.get(i) > max) {
                max = maxTemperatures.get(i);
            }
        }
        return max;
    }

    public double calculateMin() {
        List<Double> minTemperatures = new ArrayList<>(temperatures.getTemperatures().values());
        double min = minTemperatures.get(0);
        int nn = minTemperatures.size();
        for (int i = 1; i < nn; i++) {
            if (minTemperatures.get(i) < min) {
                min = minTemperatures.get(i);
            }
        }
        return min;
    }
}
