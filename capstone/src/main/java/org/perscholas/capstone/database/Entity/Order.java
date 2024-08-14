package org.perscholas.capstone.database.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
import java.util.List;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @ToString.Exclude
    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    List<OrderDetail> orderDetails;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "user_id")
    Integer userId;

    @Column(name ="order_date")
    Date orderDate;

    @Column(name ="status")
    String status;

    @Column(name ="shipped_date")
    String shippedDate;

}


