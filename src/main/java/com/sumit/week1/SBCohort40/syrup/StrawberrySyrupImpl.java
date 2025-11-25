package com.sumit.week1.SBCohort40.syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("strawberrySyrup")
public class StrawberrySyrupImpl implements Syrup {

    @Override
    public String getSyrupType() {
        return "Strawberry Syrup";
    }
}
