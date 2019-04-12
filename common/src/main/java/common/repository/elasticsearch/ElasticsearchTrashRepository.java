package common.repository.elasticsearch;

import org.springframework.data.repository.CrudRepository;

import common.domain.elasticsearch.ElasticsearchTrash;

public interface ElasticsearchTrashRepository extends CrudRepository<ElasticsearchTrash, Integer>{


}
