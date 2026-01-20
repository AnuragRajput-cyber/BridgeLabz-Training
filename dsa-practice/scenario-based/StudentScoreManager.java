package dsa_practice.scenario_based;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentScoreManager {
	public int averageScore(int[]scores) {
		int sum=0;
		for(int i:scores) {
			sum+=i;
		}
		return sum/scores.length;
	}
	public void heighestAndLowest(int[]scores) {
		int highest=Integer.MIN_VALUE;
		int low=Integer.MAX_VALUE;
		for(int i=0;i<scores.length;i++) {
			if(scores[i]>highest) {
				highest=scores[i];
			}
		}
		for(int i=0;i<scores.length;i++) {
			if(scores[i]<low) {
				low=scores[i];
			}
		}
		System.out.println("Highest Marks: "+highest);
		System.out.println("Lowest Marks: "+low);
	}
	public void aboveAverage(int []scores) {
		int avg=averageScore(scores);
		System.out.print("Above avergae marks: ");
		for(int i:scores) {
			if(i>avg) {
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		StudentScoreManager manager=new StudentScoreManager();
		Scanner sc=new Scanner(System.in);
		try {
            System.out.print("Enter number of students: ");
            int n=sc.nextInt();

            int[]scores=new int[n];

            for (int i=0;i<n;i++) {
                while(true){
                    System.out.print("Enter marks for student "+(i+1)+": ");
                    int mark=sc.nextInt();

                    if (mark<0){
                        System.out.println("Invalid input! Marks cannot be negative.");
                    } else {
                        scores[i]=mark;
                        break;
                    }
                }
            }

            System.out.println("Average Score: " +manager.averageScore(scores));
            manager.heighestAndLowest(scores);
            manager.aboveAverage(scores);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numeric values only.");
        }
	}}
