package org.perscholas.capstone.database.DAO;





import org.perscholas.capstone.database.Entity.User;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

public interface UserDAO extends JpaRepository<User, Long> {
  @Query(value="select * from users u where u.id = :id", nativeQuery = true)
  User findUserById(@Param("id") Integer id);

  User   findByEmailIgnoreCase(String email);

}
