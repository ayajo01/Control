package ma.xproce.controlaya.dao.repositories;

import ma.xproce.controlaya.dao.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {

    public Book findByTitle(String titre);
}
