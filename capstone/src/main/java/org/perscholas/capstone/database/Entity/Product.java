package org.perscholas.capstone.database.Entity;


import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "wines")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "age")
    private Integer age;

    @Column(name = "region")
    private String region;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "price", columnDefinition="DECIMAL")
    private Double price;

}

