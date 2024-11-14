package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Sale {
    String productName;
    String category;
    double price;
    int quantity;

    Sale(String productName, String category, double price, int quantity) {
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public double getTotalSale() {
        return price * quantity;
    }

    public static void main(String[] args) {
        List<Sale> sales = Arrays.asList(
            new Sale("Laptop", "Electronics", 1000, 1),
            new Sale("Smartphone", "Electronics", 500, 2),
            new Sale("Chair", "Furniture", 150, 5),
            new Sale("Desk", "Furniture", 300, 1),
            new Sale("Pen", "Stationery", 1, 100),
            new Sale("Notebook", "Stationery", 2, 50)
        );

        Map<String, Double> map = sales.stream()
            .collect(Collectors.groupingBy(Sale::getCategory, Collectors.summingDouble(x->x.getTotalSale())));

        map.entrySet().stream()
            .filter(x-> x.getValue()>100)
            //.sorted(Comparator.comparing(x->x.getValue(), Comparator.reverseOrder()))
            //.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .sorted()
            .forEach(System.out::println);

    }
}