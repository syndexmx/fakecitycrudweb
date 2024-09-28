package com.gitnub.syndexmx.fakecitycrudweb.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "street")
public class StreetEntity {

    @Id
    private long id;

    @Column(name = "street_name", length = 40)
    private String name;
}