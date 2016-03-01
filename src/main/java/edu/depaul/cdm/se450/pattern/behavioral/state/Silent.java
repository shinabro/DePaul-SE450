package edu.depaul.cdm.se450.pattern.behavioral.state;

public class Silent implements MobileAlertState {

    @Override
    public void alert(AlertStateContext ctx) {
        System.out.println("silent...");
    }
}
