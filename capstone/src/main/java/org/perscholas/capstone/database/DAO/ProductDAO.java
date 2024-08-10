package org.perscholas.capstone.database.DAO;

import org.perscholas.capstone.database.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductDAO extends JpaRepository<Product, Long> {


//     this is a JPA query just like we did in the hibernate module
    @Query("select p from Product p where concat(p.productName, '', p.id) like concat('%', :term, '%') ")

    List<Product> findByNameOrCode(String term);

    Product findProductById(int id);
}

