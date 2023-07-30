package pet.store.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue
    private Long employeeid;

    private String employeeFirstName;
    
    private String employeeLastName;
    
    private String employeePhone;
    
    private String employeeJobTitle;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pet_store_id")
    private PetStore petStore;
}
