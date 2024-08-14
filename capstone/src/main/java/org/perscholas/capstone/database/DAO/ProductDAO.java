package org.perscholas.capstone.database.DAO;

import org.perscholas.capstone.database.Entity.Wines;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductDAO extends JpaRepository<Wines, Long> {


//     this is a JPA query just like we did in the hibernate module
    @Query("select p from Wines p where concat(p.productName, '', p.id) like concat('%', :term, '%') ")

    List<Wines> findByNameOrCode(String term);

    Wines findProductById(int id);
}

