package com.giovicente.chancela.services;

import com.giovicente.chancela.models.Chancela;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ChancelaService {

    private static final int QUANTIDADE_BLOCOS = 5;

    private Random random;

    public Chancela gerarChancela() {

        String[] blocos = new String[QUANTIDADE_BLOCOS];

        Chancela chancela = new Chancela();

        for (int i = 0; i < QUANTIDADE_BLOCOS; i++) {
            blocos[i] = gerarBloco();
        }

        chancela.setValor(blocos[0].concat(blocos[1]).concat(blocos[2]).concat(blocos[3]).concat(blocos[4]));

        return chancela;
    }

    public String gerarBloco() {
        random = new Random();
        int valorAleatorio = random.nextInt();
        String blocoChancela = Integer.toHexString(valorAleatorio).toUpperCase();

        return blocoChancela;
    }

}
