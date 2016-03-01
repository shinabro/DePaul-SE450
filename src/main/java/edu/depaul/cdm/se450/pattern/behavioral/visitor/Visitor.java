package edu.depaul.cdm.se450.pattern.behavioral.visitor;

public interface Visitor {
    public void visit(Book book);

   public void visit(VideoGame vg);

}
