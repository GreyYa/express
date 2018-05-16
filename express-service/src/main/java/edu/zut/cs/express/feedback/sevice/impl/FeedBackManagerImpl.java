package edu.zut.cs.express.feedback.sevice.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import edu.zut.cs.express.feedback.domain.FeedBack;
import edu.zut.cs.express.feedback.sevice.FeedbackManager;

@Component
public class FeedBackManagerImpl implements FeedbackManager {

    @Override
    public List<FeedBack> findByCustomer(String customerId) {
        List<FeedBack> all = new ArrayList<FeedBack>();
        for (int i = 0; i < 10; i++) {
            FeedBack feedback = new FeedBack();
            all.add(feedback);
        }
        return all;
    }


}
