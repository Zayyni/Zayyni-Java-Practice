package com.zayyni.prodreadyfeatures.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

@Entity
@Table(name = "posts")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Audited
public class PostEntity extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
//    @NotAudited
    private String description;

    @PrePersist
    void beforeSave()
    {

    }

    @PreUpdate
    void beforeUpdate()
    {

    }

    @PreRemove
    void beforeDelete()
    {

    }
}
