package com.xworkz.rulesapp;

import com.xworkz.rulesapp.rules.CentralGovtRules;
import com.xworkz.rulesapp.rules.TamilNaduState;

public class RulesRunner {
    public static void main(String[] args) {

        CentralGovtRules rules = new TamilNaduState();
        rules.theAdministrativeTribunalsAct();
        rules.theContemptOfCourtsAct();
        rules.theNationalFlagCode();
        rules.theConstitutionScheduledCastesOrderAmendmentAct();
        rules.theRightToInformationAct();
        rules.theAadhaarAct();
        rules.theSeedsAct();
        rules.theMotorVehiclesAct();
        rules.theFertilizerControlOrder();


        rules.centralGovernmentSchemes();
        rules.theMinimumWagesAct();
        rules.thePaymentOfWagesAct();
        rules.theChildLabourAct();
        rules.theFactoriesAct();
        rules.theRightsOfPersonsWithDisabilitiesAct();

        rules.nationalFoodSecurityAct();
        rules.cleanIndiaMission();
        rules.nationalHealthMission();
        rules.pradhanMantriAwasYojana();
        rules.skillIndiaMission();
    }
}
