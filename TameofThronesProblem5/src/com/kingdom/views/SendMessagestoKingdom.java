package com.kingdom.views;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kingdom.controller.kingdomlist;
import com.kingdom.model.kingdom;

public class SendMessagestoKingdom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of kingdoms");
		int n= sc.nextInt();
		sc.nextLine();
		kingdomlist kingdomlist = new kingdomlist();
		while(n!=0)
		{
			System.out.println("Enter kingdom name");
			String name = sc.nextLine();
			System.out.println("Enter kingdom animal");
			String animal = sc.nextLine();
			kingdomlist.addtokingdomlist(new kingdom(name,animal));
			n--;
		}
		System.out.println("ruler of kindom wants to send messages to allies");
		List<String> messages = new ArrayList<String>();
		while(true)
		{
			
		}
	}	

}
