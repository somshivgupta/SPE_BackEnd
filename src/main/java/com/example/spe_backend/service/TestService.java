package com.example.spe_backend.service;


import com.example.spe_backend._aux.AuxTestScoreDTO;
import com.example.spe_backend.entities.TestQuestions;
import com.example.spe_backend.repository.TestQuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TestService {
    @Autowired
    TestQuestionsRepository testQuestionsRepository;
    @Autowired
    EmailSenderService senderService;

    public List<TestQuestions> getQuestionsByTestId(int testId) {
        return testQuestionsRepository.findByTestId(testId);
    }

    public String getEmail(AuxTestScoreDTO auxTestScoreDTO) {

        String email = auxTestScoreDTO.getEmail();
        Integer obtain = auxTestScoreDTO.getObtainedScore();
        Integer total = auxTestScoreDTO.getTotalScore();
        String name = auxTestScoreDTO.getName();
        String stage = auxTestScoreDTO.getStage();

        double percent = ((double) obtain / total) * 100;
        String OverallPercent = String.format("%.2f", percent);

        senderService.sendSimpleEmail(email,
                "Self Assessment Test Report",
                "Hello,\n\n" + "Based on your responses, you may have symptoms of " + stage + name + " This result is not a diagnosis, please consult a doctor or therapist who can help you get a diagnosed or treated.\n\n" +
                        "Overall Score:" + obtain + "/" + total + "\n" +
                        "Overall Percentage Score :" + OverallPercent + "\n\n" +
                        "Each of the option's scores are as follows:\n" +
                        "Not at all = 0\n" +
                        "Several days = 1\n" +
                        "More than half the days = 2\n" +
                        "Nearly every day = 3\n\n" +
                        "Interpreting your Total Percentage Score:\n" +
                        "0-20: Minimal " + name + "\n" +
                        "21-40: Mild " + name + "\n" +
                        "41-60: Moderate " + name + "\n" +
                        "61-80: Moderately severe " + name + "\n" +
                        "81-100: Severe " + name + "\n");

        return "";
    }

}
