package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data // apply getters and setters
@ToString
public class CustomerDTO {
    private String customerID;
    private String customerName;
    private String customerAddress;
    private String contact;
    private String license;
    private String nicCard;
}
