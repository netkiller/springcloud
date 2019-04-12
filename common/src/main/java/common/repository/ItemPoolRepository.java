package common.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import common.domain.ItemPool;

@Repository
public interface ItemPoolRepository extends CrudRepository<ItemPool, Integer> {

}
