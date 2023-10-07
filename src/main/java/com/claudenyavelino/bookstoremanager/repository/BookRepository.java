package com.claudenyavelino.bookstoremanager.repository;

import com.claudenyavelino.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Book, Long>{
}
