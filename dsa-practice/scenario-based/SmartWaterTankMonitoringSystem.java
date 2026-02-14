package dsa_practice.scenario_based;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class InvalidWaterLevelException extends Exception{
    public InvalidWaterLevelException(String message){
        super(message);
    }
}

class WaterTank{
    int tankId;
    double capacity;
    double currentLevel;

    public WaterTank(int tankId,double capacity,double currentLevel) throws InvalidWaterLevelException{
        this.tankId=tankId;
        this.capacity=capacity;

        if(currentLevel>capacity||currentLevel<0)
            throw new InvalidWaterLevelException("Invalid level for Tank "+tankId);

        this.currentLevel=currentLevel;
    }

    public int getTankId(){
    	return tankId;
    	}
    public double getCapacity(){
    	return capacity;
    	}
    public double getCurrentLevel(){
    	return currentLevel;
    	}

    @Override
    public String toString(){
        return "TankID:"+tankId+" Capacity:"+capacity+" Current:"+currentLevel;
    }
}

public class SmartWaterTankMonitoringSystem{

    static List<WaterTank>tanks=new ArrayList<>();

    public void addTank(WaterTank tank){
        tanks.add(tank);
    }

    
    public double calculateUsagePercentage(WaterTank tank){
        double used=tank.getCapacity()-tank.getCurrentLevel();
        double usage=(used/tank.getCapacity())*100;

        double filledPercent=(tank.getCurrentLevel()/tank.getCapacity())*100;
        if(filledPercent<20)
            System.out.println("ALERT: Tank "+tank.getTankId()+" below 20% level ("+filledPercent+"%)");

        return usage;
    }

    public static void main(String[] args){

        SmartWaterTankMonitoringSystem system=new SmartWaterTankMonitoringSystem();

        try{
            system.addTank(new WaterTank(1,1000,800));
            system.addTank(new WaterTank(2,1000,150));
            system.addTank(new WaterTank(3,1000,50));
            system.addTank(new WaterTank(4,1000,900));
        }
        catch(InvalidWaterLevelException e){
            System.out.println(e.getMessage());
        }

        for(WaterTank t:tanks){
            double usage=system.calculateUsagePercentage(t);
            System.out.println("Tank "+t.getTankId()+" Usage:"+usage+"%");
        }

        
        System.out.println("\nSorted By Lowest Level:");
        List<WaterTank>sortedByLevel=tanks.stream()
                .sorted(Comparator.comparing(WaterTank::getCurrentLevel))
                .collect(Collectors.toList());

        sortedByLevel.forEach(System.out::println);
    }
}
