package org.perscholas.capstone.database.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "order_details")
public class OrderDetail {
    @ManyToOne(fetch = FetchType.LAZY)
    private Order order;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id", nullable = false)
private Integer id;

@Column(name = "order_id", insertable= false, updatable= false)
private Integer orderId;

@Column(name = "product_id")
private Integer productId;

@Column(name= "quantity")
private Integer quantity;

}
