package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {

    private static String bun;
    private static int burgers;
    private static String sauce;
    private static List<String> ingredientsBigmac = new ArrayList<>();

    public static class BigmacBuldier {

        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();


        public BigmacBuldier bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuldier burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuldier sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuldier ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }
        private Bigmac(String bun, int burgers, String sauce, List<String> ingredientsBigmac) {
            this.bun = bun;
            this.burgers = burgers;
            this.sauce = sauce;
            this.ingredientsBigmac = new ArrayList<>(ingredientsBigmac);
        }

        public static String getBun() {
            return bun;
        }

        public static int getBurgers() {
            return burgers;
        }

        public static String getSauce() {
            return sauce;
        }

        public static List<String> getIngredients() {
            return ingredientsBigmac;
        }

    @Override
    public String toString() {
        return "Bigmac: " +
                " -bun: " + bun +
                " -burgers: " + burgers +
                " -sauce: " + sauce +
                " -ingredients: " + ingredientsBigmac;
    }
}