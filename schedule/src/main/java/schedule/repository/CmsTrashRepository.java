package schedule.repository;

import java.util.Date;

import org.springframework.data.repository.CrudRepository;

import common.domain.CmsTrash;

public interface CmsTrashRepository extends CrudRepository<CmsTrash, Integer> {

	Iterable<CmsTrash> findBySiteIdAndTypeOrderByCtime(int siteId, String string);

	Iterable<CmsTrash> findBySiteIdAndTypeAndCtimeGreaterThanOrderByCtime(int siteId, String string, Date date);

}
