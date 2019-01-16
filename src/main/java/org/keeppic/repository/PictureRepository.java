package org.keeppic.repository;

import org.keeppic.domain.Picture;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Khodzitskiy (evgeny.hodz@gmail.com)
 * @since 04.02.2018
 */
@Repository
public interface PictureRepository extends CrudRepository<Picture, Long> {
}
