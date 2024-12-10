package com.example.softlearning.infrastruture.persistence.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.softlearning.applicationcore.entity.book.dtos.BookDTO;

import jakarta.transaction.Transactional;

@Repository
public interface JpaBookRepository extends JpaRepository<BookDTO, Integer> {
    public Optional<BookDTO> findById(int id);

    public List<BookDTO> findByName(String title);
 
    @Query(value="SELECT b FROM BookDTO b WHERE b.name LIKE %:title%")
    public List<BookDTO> findByPartialTitle(String title);

    @Query(value="SELECT count(*) FROM BookDTO b WHERE b.name LIKE %:title%")
    public Integer countByPartialTitle(String title);

    @Transactional
    public BookDTO save(BookDTO book);
    public void deleteById(int id);
    
}
