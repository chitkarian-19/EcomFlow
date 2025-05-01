package com.example.Ecommerce.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "\"user\"")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    protected Integer user_id;

    protected String email_Id;
    protected String password;
    protected String phone;
    protected String name;
    protected Integer role;

}
