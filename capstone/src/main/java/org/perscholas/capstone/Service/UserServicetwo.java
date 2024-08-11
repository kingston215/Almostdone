package org.perscholas.capstone.Service;



import form.CreateAccountFormBean;
import lombok.extern.slf4j.*;
import org.perscholas.capstone.database.DAO.UserDAO;
import org.perscholas.capstone.database.Entity.User;
import org.springframework.beans.factory.annotation.*;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.*;

import java.util.*;

@Slf4j
@Component
public class UserServicetwo {

    @Autowired
    private UserDAO userDAO;


    @Autowired
    private PasswordEncoder passwordEncoder;

    public User createUser(CreateAccountFormBean form) {
        String password = passwordEncoder.encode(form.getPassword());
        // there were no errors so we can create the new user in the database
        User user = new User();
        user.setCreateTime(new Date().toInstant());
//        populateUserObject(form, user);
        user.setPassword(password);
        user.setAge(form.getAge());
        // save the user to the database
        userDAO.save(user);

        return user;
    }

//    public void populateUserObject(CreateAccountFormBean form, User user) {
//        user.setFirstName(form.getFirstName());
//        user.setLastName(form.getLastName());
//        user.setAddressLine1(form.getAddressLine1());
//        user.setAddressLine2(form.getAddressLine2());
//        user.setCity(form.getCity());
//        user.setState(form.getState());
//        user.setZipcode(form.getZipcode());
//        user.setPhone(form.getPhone());
//        user.setFirstName(form.getFirstName());
//        user.setEmail(form.getUsername());
//        user.setHomeBranch(form.getBranch());
    // we are getting in a plain text password because the user entered it into the form
//    }





//        return assignedUserRole;
//    }
}

