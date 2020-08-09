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

        for (int i = 0; i < QUANTIDADE_BLOCOS; i++) {
            blocos[i] = gerarBloco();
        }

        StringBuilder blocosConcatenados = new StringBuilder();
        blocosConcatenados.append(blocos[0]).append(blocos[1]).append(blocos[2]).append(blocos[3]).append(blocos[4]);

        Chancela chancela = new Chancela(blocosConcatenados.toString());
        return chancela;
    }

    public String gerarBloco() {

        random = new Random();
        int valorAleatorio = random.nextInt();

        return Integer.toHexString(valorAleatorio).toUpperCase();
    }

}
