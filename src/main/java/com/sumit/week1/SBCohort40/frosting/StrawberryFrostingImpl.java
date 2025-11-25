package com.sumit.week1.SBCohort40.frosting;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
@Qualifier("strawberryFrosting")
public class StrawberryFrostingImpl implements Frosting {

    @Override
    public String getFrostingType() {
        return "Strawberry Frosting";
    }
}
