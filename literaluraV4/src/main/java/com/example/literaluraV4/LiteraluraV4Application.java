package com.example.literaluraV4;

import com.example.literaluraV4.client.ClienteLiteratura;
import com.example.literaluraV4.repository.AutorRepository;
import com.example.literaluraV4.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraV4Application implements CommandLineRunner {

	@Autowired
	private LibroRepository libroRepositorio;
	@Autowired
	private AutorRepository autorRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraV4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		ClienteLiteratura client = new ClienteLiteratura(libroRepositorio, autorRepositorio);
		client.menu();
	}

}
