package br.com.alura.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

//classe para definir os dados dos livros que usaremos. somente leitura.
@JsonIgnoreProperties(ignoreUnknown = true)
public record DataBooks(@JsonAlias("title") String titulo,
                        @JsonAlias("authors") List<DataAuthors> autor,
                        @JsonAlias("language") List<String> idioma) {


}
