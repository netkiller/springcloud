package common.service;

import common.domain.Banner;

public interface BannerService {

	Iterable<Banner> findByPosition(String position);

}
