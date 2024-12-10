package com.example.softlearning;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.softlearning.applicationcore.entity.book.dtos.BookDTO;
import com.example.softlearning.infrastruture.persistence.jpa.JpaBookRepository;

@SpringBootApplication
public class SoftlearningApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SoftlearningApplication.class, args);

        System.out.println("Printing all books with BookRepository");
		
        var repo = context.getBean(JpaBookRepository.class);

        System.out.println("\n *****   Books in the repository   ***** \n");
        repo.findAll().forEach(System.out::println);
	
        System.out.println("\n *****   Java Books by tittle  ***** \n");
		repo.findByName("java").forEach(System.out::println); 
		
        System.out.println("\n *****   Add a new Java Book  ***** \n");
        repo.save(new BookDTO("Java SpringJPA","Princeton",null,"Programmers","isbnproves4","2024-04-26",
        137,1,29.99,450.0,21.0,14.0,2.5,
         true, true));
	
        System.out.println("\n *****   Java Books by partial tittle  ***** \n"); 
		repo.findByPartialTitle("java").forEach(System.out::println);
		
        System.out.println("\n *****   Update a Java Book  ***** \n");
        repo.save(new BookDTO("SpringJPA","Princeton",null,"Programmers","isbnproves4","2024-04-26",
        137,1,29.99,450.0,21.0,14.0,2.5,
        true,true));

        System.out.println("\n *****   Books by id   ***** \n");
		repo.findById(137).ifPresent(System.out::println);
	
        System.out.println("\n *****   Delete a Book  ***** \n");
		repo.deleteById(137);

        System.out.println("\n *****   Books by id    ***** \n");
		repo.findById(137).ifPresent(System.out::println);

		System.out.println("\n *****    Java Books avaliables: " + repo.countByPartialTitle("Java"));
		
	}

}
