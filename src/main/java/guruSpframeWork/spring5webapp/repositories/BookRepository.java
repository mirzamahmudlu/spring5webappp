package guruSpframeWork.spring5webapp.repositories;

import guruSpframeWork.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
