package edu.depaul.cdm.se450.pattern.behavioral.cor.approval;

public class VPApprovalAuthority extends ApprovalAuthority {
    private final double ALLOWABLE = 40 * BASE;

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println("VP will approve $" + request.getAmount());
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
}
