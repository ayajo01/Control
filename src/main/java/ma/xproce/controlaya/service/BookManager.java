package ma.xproce.controlaya.service;

import lombok.AllArgsConstructor;
import ma.xproce.controlaya.dao.entities.Book;
import ma.xproce.controlaya.dao.repositories.BookRepository;
import ma.xproce.controlaya.dto.BookDto;
import ma.xproce.controlaya.mapper.BookMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class BookManager implements BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public BookDto saveBook(BookDto bookDto) {
        Book book = bookMapper.fromBookDtoToBook(bookDto);
        book = bookRepository.save(book);
        return bookMapper.fromBookToBookDto(book);
    }

    @Override
    public List<BookDto> getBooksByTitle(String titre) {
        List<Book> books = (List<Book>) bookRepository.findByTitle(titre);
        List<BookDto> bookDtos = new ArrayList<>();
        for (Book book : books) {
            bookDtos.add(bookMapper.fromBookToBookDto(book));
        }
        return bookDtos;
    }
}
