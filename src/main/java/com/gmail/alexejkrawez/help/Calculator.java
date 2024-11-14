package com.gmail.alexejkrawez.help;

public class Calculator {
        private int result = 0;
        private int memory = 0;

        public int add(int number) {
            return result += number;
        }

        public int sub(int number) {
            return result -= number;
        }

        public int multiply(int number) {
            return result *= number;
        }

        public int divide(int number) {
            return result /= number;
        }

        public void clear() {
            result = 0;
        }

        public void memorize() {
            memory = result;
        }

        public int remember() {
            return memory;
        }

        public void print() {
            System.out.println(result);
        }
}
