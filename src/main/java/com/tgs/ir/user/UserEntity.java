package com.tgs.ir.user;

import com.tgs.ir.core.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "USERS", uniqueConstraints = { @UniqueConstraint(columnNames = { "EMAIL" }),  @UniqueConstraint(columnNames = { "UUID" }) })
public class UserEntity extends BaseEntity<Integer> {
    private static final long serialVersionUID = 1L;

    @Column(name = "UUID", nullable = false)
    private String uuId;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "NAME")
    private String name;
    
//    
//    @Column(name = "created_by")
//    private Integer created;
//    

}
