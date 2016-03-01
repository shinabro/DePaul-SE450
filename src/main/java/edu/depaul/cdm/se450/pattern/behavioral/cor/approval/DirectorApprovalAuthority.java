package edu.depaul.cdm.se450.pattern.behavioral.cor.approval;


public class DirectorApprovalAuthority extends ApprovalAuthority {
    private final double ALLOWABLE = 20 * BASE;

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println("Director will approve $" + request.getAmount());
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
}
