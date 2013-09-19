package com.malsolo.courses.web;
import com.malsolo.courses.domain.Professor;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/professors")
@Controller
@RooWebScaffold(path = "professors", formBackingObject = Professor.class)
public class ProfessorController {
}
