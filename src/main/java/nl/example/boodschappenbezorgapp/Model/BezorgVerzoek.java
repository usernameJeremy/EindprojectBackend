package nl.example.boodschappenbezorgapp.Model;

import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "deliveryrequests")
public class BezorgVerzoek {

    @Id
    @GeneratedValue
    private Long id;
    private String Supermarkt;
    private String BezorgInstructies;
    private int dateOfDelivery;
    private String BezorgVerzoek;
    private String deliveryGuyName;
    private boolean bezorgd;


    @OneToOne
    @JoinColumn(name = "grocerylist_id")
    private BoodschapLijst groceryList;
}
