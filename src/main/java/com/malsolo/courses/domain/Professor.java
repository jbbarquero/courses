package com.malsolo.courses.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooJpaEntity(table = "PROFESORES")
public class Professor {

    /**
     */
    @NotNull
    @Column(name = "NOMBRE")
    @Size(max = 50)
    private String name;

    /**
     */
    @NotNull
    @Column(name = "APELLIDO_1")
    @Size(max = 100)
    private String lastName;

    /**
     */
    @NotNull
    @Column(name = "APELLIDO_2")
    @Size(max = 100)
    private String secondLastName;
}
