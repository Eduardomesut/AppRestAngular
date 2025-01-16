/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.backend.repositories;

import com.example.backend.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author tarde
 */

public interface BookRepository extends JpaRepository<Book,Long>{
    
    
    
}
