package common.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import common.domain.CmsTrash;

@Repository
public interface CmsTrashRepository extends CrudRepository<CmsTrash, Integer> {

	List<CmsTrash> findBySiteId(int siteId);

}
