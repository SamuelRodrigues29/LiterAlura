package br.com.alura.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//classe para definir os dados dos livros que usaremos. somente leitura.
@JsonIgnoreProperties(ignoreUnknown = true)
public record DataBooks(String title,
                        String author,
                        String language,
                        @JsonAlias("birth_year")Integer birthYear,
                        @JsonAlias("death_year") Integer DeathYear) {



}
