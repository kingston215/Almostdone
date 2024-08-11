//package org.perscholas.capstone.database.Entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//import java.util.Date;
//import java.util.List;
//
//@Setter
//@Getter
//@Entity
//@ToString
//@AllArgsConstructor
//@NoArgsConstructor
//@Table(name = "users") // Table name in lowercase
//public class User {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY) // Requirement: Proper primary keys
//    @Column(name = "id")
//    private Integer id;
//
//    @Column(name = "email") // Requirement: Column names lowercase
//    private String email;
//
//    @Column(name = "password") // Requirement: Column names lowercase
//    private String password;
//
//    @Column(name = "create_date") // Requirement: Column names lowercase
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date createDate;
//}
//public class UserRole {
//}
