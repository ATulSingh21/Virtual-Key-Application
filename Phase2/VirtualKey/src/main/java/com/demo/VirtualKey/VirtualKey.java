package com.demo.VirtualKey;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;

public class VirtualKey {
	
		String path="./src/main/Files";
		Scanner sc=new Scanner(System.in);

		public void UserDataPanel() {
			System.out.println("Welcome!\n");
			
			 System.out.println("This is Virtual Key  your Application!\n");
			 System.out.println("========================================================");
			 System.out.println("Developer Name: Atul Singh\n");
			 System.out.println("========================================================");
		}
		public void mainMenuDashBord() {
			System.out.println("1. Arrange file in Ascending Order");
			  System.out.println("2.Go to SubMenu Option");
			  System.out.println("3.Exit from Application");
		}
		public void FilePath() {
			File filedr=new File(path);
			if(filedr.isDirectory()) {
				List<String> Listfile=Arrays.asList(filedr.list());
				Collections.sort(Listfile);
				System.out.println("All Files in Ascending order \n");
				for(String s:Listfile) {
					System.out.println(s);
				}
			}
		}
		public void AddFile() {
			
			
			String newF=sc.nextLine();
			
			File newFile=new File(path+ "\\"+newF);
			try {
				if(newFile.exists() && newFile.isFile()) {
					System.out.println("File already Exists at Location");
					}
				
				else {
					
					newFile.createNewFile();
					 {
						System.out.println("File Created");
					}
				}
				}
			
			catch(IOException e){
				e.printStackTrace();
			}
		}
		public void deleteFile(){
			String DelFile=sc.nextLine();
			File del=new File(path+ "\\" +DelFile);
			try {
				if(del.exists() && del.isFile()) {
					del.delete();
					System.out.println("File Deleted");
					}
				else {
					System.out.println("File Not Found");
				}
				}
			
			catch(Exception e){
				e.printStackTrace();
			}
		}
		public void fileSearch() {
			String SearchFile=sc.nextLine();
			File Search=new File(path+ "\\" +SearchFile);
			if(Search.exists() && Search.isFile()) {
				System.out.println("File Exists");
			}
			else {
				System.out.println("File doesm't exists");
			}
			
		}
		
		public static void subSwitch() {
			VirtualKey t=new VirtualKey();
			  System.out.println("1. Add Specific file to the Application");
			  System.out.println("2. Delete Specific file from the Application");
			  System.out.println("3. Search Specific file from the Application");
			  System.out.println("4. Enter to main Menu");
			  
			  int subOption;
			try {
				 do {
				  System.out.println("\n Please Choose Option:");
				  Scanner sc=new Scanner(System.in);
				  subOption=sc.nextInt();
				  switch(subOption) {
				  case 1:
					  System.out.println("Please enter file you want to add");
					  t.AddFile();
					  break;
				  case 2:
					  System.out.println("Enter file name you want to delete");
					  t.deleteFile();
					  break;
				  case 3:
					  System.out.println("Enter file name you want to serach");
					  t.fileSearch();
					  break;
				  case 4:
					  System.out.println("This is Main Menu");
					  t.mainMenuDashBord();
					  break;
				  default:
					  System.out.println("Invalid Choice");
			  }
			  
		}while(subOption!=4);
		
		}catch(Exception e) {System.out.println("please enter number only");}
		}
		public void MainMenu() {
			VirtualKey t = new VirtualKey();
			 Scanner sc=new Scanner(System.in);
			  System.out.println("Options based on your Requirments: \n");
			  t.mainMenuDashBord();
			  
			  int Option;
			 try {
				 do {
			 
				  System.out.println("\nPlease Choose Option:");
				  Option=sc.nextInt();
				  switch(Option) {
				  case 1:
					  t.FilePath();
					  break;
				  case 2:
					  subSwitch();
					  break;
				  case 3:
					  System.out.println("*****************************************************");
					  break;
				  default:
					  System.out.println("Invalid Choice! Please Enter Right Choice");
			  }
			  
		}while(Option!=3);
		System.out.println("Thankyou for using this application");
		}catch(Exception e) {
			System.out.println("please enter number only");
		}
		} 
	}



