package com.giovicente.chancela.controllers;

import com.giovicente.chancela.models.Chancela;
import com.giovicente.chancela.services.ChancelaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chancela")
public class ChancelaController {

    @Autowired
    private ChancelaService chancelaService;

    @GetMapping
    public Chancela postChancela() { return chancelaService.gerarChancela(); }

}
