package org.example.customjavanonreactapp.modal;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Builder
@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Data {

    @Id
    @GeneratedValue
    private Long id;
    private Long requestCameTime;
    private String data;

}
