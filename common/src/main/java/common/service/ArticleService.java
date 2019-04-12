package common.service;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import common.domain.Article;
import common.domain.Comment;
import common.domain.RecentRead;
import common.pojo.ResponseRestful;

public interface ArticleService {

//	ResponseEntity<ResponseRestful> recentAdd(RecentRead recentRead);

//	ResponseRestful recentList(int id, Pageable pageable);

//	ResponseRestful recentDelete(int memberId, int articleId);

	ResponseRestful commentAdd(Comment comment);

	ResponseRestful commentList(int articleId, Pageable pageable);

	/**
	 * 删除收藏
	 * @param memberId
	 * @param article
	 * @return
	 */
//	ResponseRestful favoritesDelete(int memberId, Article article);


	/**
	 * 添加收藏
	 * @param memberId
	 * @param articleId
	 * @return
	 */
//	ResponseRestful favoritesAdd(int memberId, int articleId);
	
	/**
	 * 查询收藏列表
	 * @param memberId
	 * @param page
	 * @param size
	 * @return
	 */
//    ResponseRestful favoritesList(int memberId, int page, int size);

}
