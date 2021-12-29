package cloud.cholewa.backend.customer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class CustomerEntity {

    @Id
    @SequenceGenerator(name = "customer_id_generator", sequenceName = "customer_id_generator")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_id_generator")
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
