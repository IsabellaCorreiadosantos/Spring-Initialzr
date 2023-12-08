package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity //define que sera uma tabela
@Table(name = "tb_postagens")
public class Postagem {

	 @Id //é a chave primeria primary kei 
		@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
		private Long id;
		// not null = proibe ausencia de qualquer coisa
	 	// not blanck = proibe ausencia de qualquer coisa e tambem campos com espaço
	 	// size = titulo  que tenho no minimo 5 caracteres e no maximo 100
		@NotBlank(message = "O atributo título é Obrigatório!") 
		@Size(min = 5, max = 100, message = "O atributo título deve conter no mínimo 05 e no máximo 100 caracteres")
		@Column(length = 100)
		private String titulo;
		
		@Column(length = 100)
		@NotBlank(message = "O atributo texto é Obrigatório!")
		@Size(min = 10, max = 1000, message = "O atributo texto deve conter no mínimo 10 e no máximo 1000 caracteres")
		private String texto;
		
		@UpdateTimestamp
		private LocalDateTime data;

	    public Long getId() {
	        return this.id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getTitulo() {
	        return this.titulo;
	    }

	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }

	    public String getTexto() {
	        return this.texto;
	    }

	    public void setTexto(String texto) {
	        this.texto = texto;
	    }

	    public LocalDateTime getData() {
	        return this.data;
	    }

	    public void setData(LocalDateTime data) {
	        this.data = data;
	    }
}
