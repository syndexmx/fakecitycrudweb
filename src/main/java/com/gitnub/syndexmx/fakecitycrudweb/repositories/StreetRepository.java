package com.gitnub.syndexmx.fakecitycrudweb.repositories;

import com.gitnub.syndexmx.fakecitycrudweb.domain.StreetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreetRepository extends JpaRepository<StreetEntity, Long> {
}
