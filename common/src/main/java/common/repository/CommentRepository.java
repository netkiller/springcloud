package common.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import common.domain.Article;
import common.domain.Comment;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Integer> {

	Page<Comment> findByArticle(Article article, Pageable pageable);

}
