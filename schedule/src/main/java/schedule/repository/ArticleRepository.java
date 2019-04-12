package schedule.repository;

import org.springframework.stereotype.Repository;

import schedule.repository.ViewRepository;
import common.domain.Article;

@Repository
public interface ArticleRepository extends ViewRepository<Article, Integer> {

	Iterable<Article> findBySiteId(int siteId);

	Iterable<Article> findBySiteIdAndIdGreaterThanOrderByIdAsc(int siteId, int id);

}
