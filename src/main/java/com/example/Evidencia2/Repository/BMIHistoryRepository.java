package com.example.Evidencia2.Repository;
import com.example.Evidencia2.Model.BMIHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BMIHistoryRepository extends JpaRepository<BMIHistory, Long> {
    List<BMIHistory> findByUserIdOrderByDateDesc(Long userId);
}
