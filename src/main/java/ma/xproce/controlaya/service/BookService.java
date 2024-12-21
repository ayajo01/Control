package ma.xproce.controlaya.service;

import ma.xproce.controlaya.dao.entities.Book;
import ma.xproce.controlaya.dto.BookDto;

import java.util.List;

public interface BookService {
    public BookDto saveBook(BookDto bookDto);


    List<BookDto> getBookByTitle(String titre);
}
