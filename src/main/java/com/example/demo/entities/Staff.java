package com.example.demo.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import javax.persistence.*;

@Data
@Table(name = "staff")
@Entity
@NoArgsConstructor
public class Staff {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	//@OneToOne(mappedBy = "staff", cascade = CascadeType.ALL, orphanRemoval = true)
    //private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
	
    private String name;
    private LocalDate birthday;
    private String phone_number;
    private String address;
    
    

}
