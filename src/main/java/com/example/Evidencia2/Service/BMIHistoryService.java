package com.example.Evidencia2.Service;
import com.example.Evidencia2.Model.BMIHistory;

import java.util.List;

public interface BMIHistoryService {
    List<BMIHistory> getHistory(Long userId);
    void addBMIRecord(Long userId, double bmi);
}
