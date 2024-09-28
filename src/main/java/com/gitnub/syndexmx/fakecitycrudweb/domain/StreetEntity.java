package com.gitnub.syndexmx.fakecitycrudweb.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GeneratedColumn;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "street")
public class StreetEntity {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "street_name", length = 40)
    private String name;
}