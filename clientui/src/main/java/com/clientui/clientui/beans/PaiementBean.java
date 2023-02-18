package com.clientui.clientui.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaiementBean {
    private int id;

    private Integer idCommande;

    private Double montant;

    private Long numeroCarte;
}
