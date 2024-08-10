package org.perscholas.capstone.database.DAO;




import org.apache.catalina.User;
import org.springframework.data.jpa.repository.*;

public interface UserDAO extends JpaRepository<User, Long> {


    User findByEmailIgnoreCase(String email);

}
