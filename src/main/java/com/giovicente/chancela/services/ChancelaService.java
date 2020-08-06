package com.giovicente.chancela.services;

import com.giovicente.chancela.models.Chancela;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.time.LocalDate;
import java.util.Random;

@Service
public class ChancelaService {

    private static final int QUANTIDADE_BLOCOS = 5;

    private Random random;

    public Chancela gerarChancela() {

        Chancela chancela = new Chancela();

        random = new Random();

        LocalDate dataHoraTransacao = LocalDate.now();
        String dataHoraString = dataHoraTransacao.toString() + random.nextInt();

        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");

            digest.reset();
            digest.update(dataHoraString.getBytes("utf8"));

            chancela.setValor(String.format("%040x", new BigInteger(1, digest.digest())).toUpperCase());
        // Incluir melhores logs e rastreabilidade do problema neste catch, para melhor análise em caso de erros em produção
        } catch (Exception e) {
            e.printStackTrace();
        }

        return chancela;
    }
}
