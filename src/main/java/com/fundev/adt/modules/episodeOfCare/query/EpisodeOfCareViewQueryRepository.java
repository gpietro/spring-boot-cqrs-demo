package com.fundev.adt.modules.episodeOfCare.query;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EpisodeOfCareViewQueryRepository extends JpaRepository<EpisodeOfCareView, UUID> {
}