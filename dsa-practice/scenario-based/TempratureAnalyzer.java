package dsa_practice.scenario_based;

import java.util.Arrays;
import java.util.Random;

public class TempratureAnalyzer {
	public static float[][] dataGenerator(float[][]temp) {
		Random random=new Random();
		for(int i=0;i<temp.length;i++) {
			for(int j=0;j<temp[0].length;j++) {
				temp[i][j]=random.nextFloat()*100;
			}
		}
		return temp;
	}
	public static void hottestAndColdest(float[][] temp) {
		float hottest=temp[0][0];
        float coldest=temp[0][0];

        for (int i=0;i<temp.length;i++) {
            for (int j=0;j<temp[i].length;j++) {
                if (temp[i][j]>hottest){
                    hottest=temp[i][j];
                }
                if (temp[i][j]<coldest) {
                    coldest=temp[i][j];
                }
            }
        }

        System.out.println("Hottest Temperature: " + hottest+"°C");
        System.out.println("Coldest Temperature: " + coldest+"°C");
	}
	public static float[] averageTempPerDay(float[][]temp) {
		float[]avg=new float[temp.length];
		for(int i=0;i<temp.length;i++) {
			float sum=0;
			for(int j=0;j<temp[i].length;j++) {
				sum+=temp[i][j];
			}
			avg[i]=sum/temp[i].length;
		}
		return avg;
	}
	public static void main(String[] args) {
		float[][]temprature=new float[7][24];
		float[][]ans=dataGenerator(temprature);
		hottestAndColdest(temprature);
		float[]average=averageTempPerDay(temprature);
		for(int i=0;i<average.length;i++) {
				System.out.println(average[i]);
		}
	}
}
