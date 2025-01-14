package auth.product.model;

import auth.product.dto.ProductRequestDTO;
import jakarta.persistence.*;

@Entity
@Table(name = "TB-PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private double price;

    public Product() {
    }


    public Product(ProductRequestDTO body) {
        this.name = body.name();
        this.price = body.price();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
