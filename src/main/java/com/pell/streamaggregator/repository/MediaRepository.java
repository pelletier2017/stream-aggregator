package com.pell.streamaggregator.repository;

import com.pell.streamaggregator.entity.Media;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaRepository extends CrudRepository<Media, Long> {

}
