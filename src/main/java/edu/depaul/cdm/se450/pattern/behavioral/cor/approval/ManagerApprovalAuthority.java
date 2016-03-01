package edu.depaul.cdm.se450.pattern.behavioral.cor.approval;

public class ManagerApprovalAuthority extends ApprovalAuthority {
    private final double ALLOWABLE = 10 * BASE;

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println("Manager will approve $" + request.getAmount());
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
}
