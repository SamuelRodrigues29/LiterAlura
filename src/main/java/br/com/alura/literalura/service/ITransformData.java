package br.com.alura.literalura.service;

// Classe para ler os dados vindos da api de maneira genérica,pensando em escalabilidade.

public interface ITransformData {
    <T> T theDataFromApi (String json, Class<T> classe);
}
