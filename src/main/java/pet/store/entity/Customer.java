package pet.store.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Set;

@Entity
@Data
public class Customer {
	@Id
    @GeneratedValue
    private Long customerID;

    private String customerFirstName;
    
    private String customerLastName;

    private String customerEmail;

    @ManyToMany(mappedBy = "customers", cascade = CascadeType.PERSIST)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<PetStore> petStores;

}
