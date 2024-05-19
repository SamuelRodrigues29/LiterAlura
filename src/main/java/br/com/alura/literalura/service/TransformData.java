package br.com.alura.literalura.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

// Classe para tratar os dados,usando jackson dessa vez.
public class TransformData implements ITransformData {

        // ObjectMapper converte os dados json vindo da serie
    private ObjectMapper mapper = new ObjectMapper();


    @Override
    public <T> T theDataFromApi(String json, Class<T> classe) {
        try {
            return mapper.readValue(json, classe); // lê o objeto mapeado e retorna um json em forma de classe.
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
