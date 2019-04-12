package feign.restful;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import common.pojo.ResponseRestful;
import common.domain.StatisticsHistory;
import common.feign.Statistics;

@RestController
@RequestMapping("/article/statistics")
public class StatisticsRestController {
	
	@Autowired
	private Statistics statistics;
	
	@RequestMapping("/get/{memberId}/{articleId}")
	public ResponseRestful getStatistics(@PathVariable("memberId") int memberId, @PathVariable("articleId") int articleId) {
		return statistics.getStatistics(memberId, articleId);
	}

	@RequestMapping("/set/{type}/{uid}/{id}")
	public ResponseRestful setLikeCount(@PathVariable("type") StatisticsHistory.StatisticsType type, @PathVariable("uid") int uid, @PathVariable("id") int id) {
		return statistics.setLikeCount(type, uid, id);
	}
}
