package com.example.admoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.admoneyapi.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
