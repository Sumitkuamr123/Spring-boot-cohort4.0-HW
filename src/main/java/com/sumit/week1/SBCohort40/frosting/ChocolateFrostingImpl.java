package com.sumit.week1.SBCohort40.frosting;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("chocolateFrosting")
public class ChocolateFrostingImpl implements Frosting {

    @Override
    public String getFrostingType() {
        return "Chocolate Frosting";
    }
}
