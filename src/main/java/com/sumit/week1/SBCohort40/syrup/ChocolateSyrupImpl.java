package com.sumit.week1.SBCohort40.syrup;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Qualifier("chocolateSyrup")
public class ChocolateSyrupImpl implements Syrup {

    @Override
    public String getSyrupType() {
        return "Chocolate Syrup";
    }
}
