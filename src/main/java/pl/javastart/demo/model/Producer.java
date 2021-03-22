package pl.javastart.demo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Producer implements Serializable {
    private static final long serialVersionUID = 5028602174496510333L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String country;
    private double totalIncome;
    @OneToMany(mappedBy = "producer")
    private List<Product> productList;

    public Producer() {
    }

    public Producer(String name, String country, double totalIncome, List<Product> productList) {
        this.name = name;
        this.country = country;
        this.totalIncome = totalIncome;
        this.productList = productList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
