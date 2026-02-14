package dsa_practice.scenario_based;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class InsufficientResourceException extends Exception{
	public InsufficientResourceException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}
class ReliefCenter{
	String centerId;
	String centerName;
	HashMap<String,Integer>resources;
	ReliefCenter(String centerId,String centerName,HashMap<String,Integer>resources) {
		// TODO Auto-generated constructor stub
		this.centerId=centerId;
		this.centerName=centerName;
		this.resources=resources;
	}
	public String getCenterId() {
		return centerId;
	}
	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}
	public String getCenterName() {
		return centerName;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	public HashMap<String, Integer> getResources() {
		return resources;
	}
	public void setResources(HashMap<String, Integer> resources) {
		this.resources = resources;
	}
}
class Resource{
	String name;
	int quantity;
	Resource(String name,int quatity){
		this.name=name;
		this.quantity=quatity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
class AreaRequest{
    String areaName;
    HashMap<String,Integer>requestResources;

    AreaRequest(String areaName,HashMap<String,Integer>requestResources){
        this.areaName=areaName;
        this.requestResources=requestResources;
    }
}
public class DisasterReliefResourceAllocationSystem {
	static HashMap<String, ReliefCenter>RELIEF_CENTERS=new HashMap<>();
	static Queue<AreaRequest>AFFECTED_AREAS=new LinkedList<>();
	
	public void addReliefCenter(ReliefCenter rf) {
		RELIEF_CENTERS.put(rf.centerName,rf);
	}
	public void addAffectedArea(AreaRequest ar) {
		AFFECTED_AREAS.add(ar);
	}
	
	public void allocateResources() throws InsufficientResourceException{

	    while(!AFFECTED_AREAS.isEmpty()){
	        AreaRequest area=AFFECTED_AREAS.poll();
	        System.out.println("\nAllocating for Area: "+area.areaName);

	        for(String resourceName:area.requestResources.keySet()){

	            int neededQty=area.requestResources.get(resourceName);
	            boolean allocated=false;

	            for(ReliefCenter center:RELIEF_CENTERS.values()){
	                HashMap<String,Integer>stock=center.getResources();

	                if(stock.containsKey(resourceName)&&stock.get(resourceName)>=neededQty){
	                    stock.put(resourceName,stock.get(resourceName)-neededQty);

	                    System.out.println(resourceName+"("+neededQty+") allocated from "
	                            +center.getCenterName()+" Remaining:"+stock.get(resourceName));

	                    allocated=true;
	                    break;
	                }
	            }

	            if(!allocated)
	                throw new InsufficientResourceException(
	                        "Insufficient "+resourceName+" for "+area.areaName+" Required:"+neededQty);
	        }
	    }

	    System.out.println("\nAll areas served successfully!");
	}

	public static void main(String[] args){

	    DisasterReliefResourceAllocationSystem system=new DisasterReliefResourceAllocationSystem();

	    HashMap<String,Integer>r1=new HashMap<>();
	    r1.put("Food",50);
	    r1.put("Water",40);
	    r1.put("Medical",20);
	    system.addReliefCenter(new ReliefCenter("C1","Delhi Center",r1));

	    HashMap<String,Integer>r2=new HashMap<>();
	    r2.put("Food",30);
	    r2.put("Water",20);
	    r2.put("Medical",10);
	    system.addReliefCenter(new ReliefCenter("C2","Noida Center",r2));

	    HashMap<String,Integer>a1=new HashMap<>();
	    a1.put("Food",15);
	    a1.put("Water",10);
	    system.addAffectedArea(new AreaRequest("Village A",a1));

	    HashMap<String,Integer>a2=new HashMap<>();
	    a2.put("Food",20);
	    a2.put("Medical",10);
	    system.addAffectedArea(new AreaRequest("Village B",a2));

	    HashMap<String,Integer>a3=new HashMap<>();
	    a3.put("Water",25);
	    a3.put("Medical",5);
	    system.addAffectedArea(new AreaRequest("Village C",a3));

	    try{
	        system.allocateResources();
	    }
	    catch(InsufficientResourceException e){
	        System.out.println("ALLOCATION FAILED: "+e.getMessage());
	    }
	}


}
