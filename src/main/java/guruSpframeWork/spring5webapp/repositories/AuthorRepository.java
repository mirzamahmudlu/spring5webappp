package guruSpframeWork.spring5webapp.repositories;

import guruSpframeWork.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
