package com.clientui.clientui.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductBean {
    private int id;
    private String titre;
    private String description;
    private String image;
    private Double prix;
}
