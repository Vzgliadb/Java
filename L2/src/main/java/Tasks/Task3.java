package Tasks;

import Adress.Address;
import Orders.Order;
import Products.Apple;
import Products.Orange;
import Products.Product;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) throws IOException {
        String [] Country = {"US", "Russia", "France", "Germany", "Canada", "Italy"};
        String [] City = {"Paris", "Berlin", "Moscow", "Rome", "New York", "Ottawa"};
        String [] Street = {"Long", "Chine", "Ruben", "Baker", "Holy Mary", "Gagarina"};
        final int House = 116;
        final int Floor = 12;
        final int Appart = 160;
        final int Price = 500;
        final int Weight = 500;
        final int Orders = 100;
        String[] titles = {"firstTitle", "secondTitle", "thirdTitle"};
        String[] colors = {"green", "red", "yellow"};
        List<Order> orders = new ArrayList<>();
        Random random = new Random();
        for (int numberOfOrders = 0; numberOfOrders<Orders; numberOfOrders++){
            int randomIndForCountry = random.nextInt(Country.length);
            int randomIndForCity = random.nextInt(City.length);
            int randomIndForStreet = random.nextInt(Street.length);
            int randomHouse = random.nextInt(House);
            int randomFloor = random.nextInt(Floor);
            int randomAppart = random.nextInt(Appart);
            Address address = new Address(
                    Country[randomIndForCountry],
                    City[randomIndForCity],
                    Street[randomIndForStreet],
                    randomHouse,
                    randomFloor,
                    randomAppart);
            int randomPrice = random.nextInt(Price);
            int randomWeight = random.nextInt(Weight);
            int randomIndForTitle = random.nextInt(titles.length);
            int randomIndForColor = random.nextInt(colors.length);
            boolean randomBones = random.nextBoolean();
            Apple apple = new Apple(randomPrice, titles[randomIndForTitle], randomWeight, colors[randomIndForColor]);
            Orange orange = new Orange(randomPrice, titles[randomIndForTitle], randomWeight, randomBones );
            List<Product> products = new ArrayList<>();
            products.add(apple);
            products.add(orange);
            Order order = new Order(products, address);
            orders.add(order);
        }
        ObjectMapper mapper = new ObjectMapper();
        FileWriter fileWriter = new FileWriter("src/orders.json");
        mapper.writeValue(fileWriter, orders);
        FileReader fileReader = new FileReader("src/orders.json");
        orders = mapper.readValue(fileReader, List.class);
    }}

