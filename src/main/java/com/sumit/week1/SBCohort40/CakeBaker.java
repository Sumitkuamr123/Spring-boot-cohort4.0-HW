package com.sumit.week1.SBCohort40;

import com.sumit.week1.SBCohort40.syrup.Syrup;
import com.sumit.week1.SBCohort40.frosting.Frosting;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    private final Frosting frosting;
    private final Syrup syrup;

// Constructor Injection with Qualifiers
    public CakeBaker(@Qualifier("chocolateFrosting") Frosting frosting, @Qualifier("chocolateSyrup") Syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }

    public void bakeCake() {
        System.out.println("Baking a cake with " + frosting.getFrostingType() + " and " + syrup.getSyrupType());
    }
}

