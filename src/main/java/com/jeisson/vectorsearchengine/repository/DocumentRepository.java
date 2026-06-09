package com.jeisson.vectorsearchengine.repository;

import com.jeisson.vectorsearchengine.entity.DocumentEntity;
import org.springframework.data.domain.SearchResults;
import org.springframework.data.domain.Vector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface DocumentRepository extends JpaRepository<DocumentEntity, UUID> {
    @Query(value = "SELECT * FROM documents ORDER BY embedding <=> CAST(:embedding AS vector) LIMIT :limit ", nativeQuery = true)
    SearchResults<DocumentEntity> search(@Param("embedding") Vector embedding, @Param("limit") int limit );
}
