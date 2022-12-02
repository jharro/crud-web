package com.example.crudweb.respositorio;

import com.example.crudweb.modelo.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepositorio extends JpaRepository<Productos,Integer> {
}
