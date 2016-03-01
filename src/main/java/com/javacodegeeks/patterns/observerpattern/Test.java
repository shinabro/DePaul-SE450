package com.javacodegeeks.patterns.observerpattern;

public class Test {

	public static void main(String[] args) {
		CommentaryObjectObservable obj = new CommentaryObjectObservable("Soccer Match [2014AUG24]");
		SMSUsersObserver observerAdam = new SMSUsersObserver(obj, "Adam Warner [New York]");
		SMSUsersObserver observerTim = new SMSUsersObserver(obj,"Tim Ronney [London]");
		observerAdam.subscribe();
		observerTim.subscribe();
		System.out.println("------------------------------------------------------");
		obj.setDesc("Welcome to live Soccer match");
		obj.setDesc("Current score 0-0");

		observerAdam.unSubscribe();
		
		obj.setDesc("It's a goal!!");
		obj.setDesc("Current score 1-0");
	}
}
