package edu.depaul.cdm.se450.pattern.behavioral.cor.approval;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
            ManagerApprovalAuthority manager = new ManagerApprovalAuthority();
            DirectorApprovalAuthority director = new DirectorApprovalAuthority();
            VPApprovalAuthority vp = new VPApprovalAuthority();
            PresidentApprovalAuthority president = new PresidentApprovalAuthority();
            manager.setSuccessor(director);
            director.setSuccessor(vp);
            vp.setSuccessor(president);

            // Press Ctrl+C to end.
            try {
                while (true) {
                    System.out.println("Enter the amount to check who should approve your expenditure.");
                    System.out.print(">");
                    double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                    manager.processRequest(new PurchaseRequest(d, "General"));
                }
            } catch(Exception e) {
                System.exit(1);
            }
    }
}
