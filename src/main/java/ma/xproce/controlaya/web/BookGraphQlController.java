package ma.xproce.controlaya.web;

import lombok.AllArgsConstructor;
import ma.xproce.controlaya.dto.BookDto;
import ma.xproce.controlaya.service.BookService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class BookGraphQlController {

    private BookService bookService ;

    @MutationMapping
    public BookDto saveBook(@Argument BookDto book){
        return bookService.saveBook(book);
    }


    @QueryMapping
    public List<BookDto> getBookByTitle(@Argument String titre){
        return bookService.getBookByTitle(titre);
    }
}
