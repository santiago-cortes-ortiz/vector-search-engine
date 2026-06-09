package com.jeisson.vectorsearchengine.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.Array;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.UUID;

@Entity
@Table(name = "documents")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DocumentEntity {
    @Id
    private UUID id;
    private String content;


    @JdbcTypeCode(SqlTypes.VECTOR)
    @Array(length = 3)
    private float[] embedding;
}
