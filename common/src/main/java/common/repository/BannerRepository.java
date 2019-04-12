package common.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import common.domain.Banner;
@Repository
public interface BannerRepository extends CrudRepository<Banner, Integer> {

	Iterable<Banner> findByPosition(String position);

}
