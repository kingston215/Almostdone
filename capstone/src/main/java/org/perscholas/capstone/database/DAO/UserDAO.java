package org.perscholas.capstone.database.DAO;





import org.perscholas.capstone.database.Entity.User;
import org.springframework.data.jpa.repository.*;

public interface UserDAO extends JpaRepository<User, Long> {


  User   findByEmailIgnoreCase(String email);

}
