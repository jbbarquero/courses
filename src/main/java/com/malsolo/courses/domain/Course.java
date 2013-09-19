package com.malsolo.courses.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooJpaEntity(table = "CURSOS")
public class Course {

    /**
     */
    @NotNull
    @Column(name = "TITULO")
    @Size(max = 100)
    private String title;

    /**
     */
    @Column(name = "NIVEL")
    private long status;

    /**
     */
    @Column(name = "HORAS")
    private int hours;

    /**
     */
    @Column(name = "ACTIVO")
    private Boolean active;

    /**
     */
    @NotNull
    @ManyToOne
    private Professor professor;
}
