package edu.depaul.cdm.se450.pattern.behavioral.cor.approval;

public abstract class ApprovalAuthority {
    protected static final double BASE = 500;
    protected ApprovalAuthority successor;

    public void setSuccessor(ApprovalAuthority successor) {
        this.successor = successor;
    }

    abstract public void processRequest(PurchaseRequest request);
}
