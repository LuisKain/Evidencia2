package com.example.Evidencia2.ServiceImp;
import com.example.Evidencia2.Model.BMIHistory;
import com.example.Evidencia2.Repository.BMIHistoryRepository;
import com.example.Evidencia2.Service.BMIHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class BMIHistoryServiceImpl implements BMIHistoryService {

    @Autowired
    private BMIHistoryRepository bmiHistoryRepository;

    @Override
    public List<BMIHistory> getHistory(Long userId) {
        return bmiHistoryRepository.findByUserIdOrderByDateDesc(userId);
    }

    @Override
    public void addBMIRecord(Long userId, double bmi) {
        if (bmi <= 0) {
            throw new IllegalArgumentException("El IMC debe ser un valor positivo mayor que cero.");
        }


        BMIHistory bmiHistory = new BMIHistory(userId, bmi, LocalDate.now());
        bmiHistoryRepository.save(bmiHistory);
    }
}
