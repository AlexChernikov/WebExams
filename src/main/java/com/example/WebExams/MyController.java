package com.example.WebExams;

import com.example.WebExams.ExamClasses.Exam;
import com.example.WebExams.Parsers.ExamParser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class MyController {
    private static HashMap<String, Exam> exams = ExamParser.parse();

    /*@GetMapping("/greeting")
    @ResponseBody
    public String greeting(@RequestParam String id) {
        return "hello ID: " + id;
    }*/
    @GetMapping("/personId")
    public List<String> personId(@RequestParam(required=false, name="id") String id) {
        System.out.println("THERE " + id);
        if (id != null) {
            return List.of("Your id is: " + id);
        } else {
            return List.of("Write id in request (?id=)");
        }
    }

    @GetMapping("/listProducts")
    public List<Product> listProducts() {
        return products;
    }

    @GetMapping("/exams")
    public Set<String> getExams() {
        return exams.keySet();
    }

    List<Product> products = Collections.synchronizedList(new ArrayList<>());

    {
        products.add(new Product("Product1", 1, true));
        products.add(new Product("Product2", 10, true));
        products.add(new Product("Product3", 100, false));
    }

}

class Product {

    private String name;
    private int price;
    private boolean inStock;

    public Product(String name, int price, boolean inStock) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", inStock=" + inStock +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}