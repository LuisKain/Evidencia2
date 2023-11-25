package com.example.Evidencia2.Controller;
import ch.qos.logback.core.model.Model;
import com.example.Evidencia2.Model.BMIHistory;
import com.example.Evidencia2.Service.BMIHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bmi")
public class BMIController {

    @Autowired
    private BMIHistoryService bmiHistoryService;

    @GetMapping("/history/{userId}")
    public List<BMIHistory> getHistory(@PathVariable Long userId) {
        return bmiHistoryService.getHistory(userId);
    }

    @PostMapping("/calculate")
    public void calculateBMI(@RequestParam Long userId, @RequestParam double bodyMassIndex) {
        //return calculo falta desarrollar
        bmiHistoryService.addBMIRecord(userId, bodyMassIndex);
    }

    @GetMapping("/bmi/history/{userId}")
    public String showBMIHistory(@PathVariable Long userId, Model model) {
        List<BMIHistory> bmiHistoryList = bmiHistoryService.getHistory(userId);
        model.addText("bmiHistoryList");
        return "bmiHistory";
    }
}
