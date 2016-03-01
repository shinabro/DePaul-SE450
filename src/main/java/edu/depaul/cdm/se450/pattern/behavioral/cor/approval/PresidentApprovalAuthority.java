package edu.depaul.cdm.se450.pattern.behavioral.cor.approval;

public class PresidentApprovalAuthority extends ApprovalAuthority {
    private final double ALLOWABLE = 60 * BASE;

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println("President will approve $" + request.getAmount());
        } else {
            System.out.println("Your request $" + request.getAmount() + " must be approved by the board of directors");
        }
    }
}
