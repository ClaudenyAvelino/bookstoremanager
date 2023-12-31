package com.claudenyavelino.bookstoremanager.service;

import com.claudenyavelino.bookstoremanager.dto.MessageResponseDTO;
import com.claudenyavelino.bookstoremanager.entity.Book;
import com.claudenyavelino.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(Book book) {
        Book saveBook = bookRepository.save(book);
        return MessageResponseDTO.builder()
                .message("Book created with ID"+ saveBook.getId())
                .build();
    }


}
