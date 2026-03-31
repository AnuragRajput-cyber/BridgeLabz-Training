package dsa_practice.scenario_based;

class Product{
    int id;
    String name;
    double price;
    Product(int id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}

class StageNode{
    String stage;
    StageNode next;
    StageNode(String stage){
        this.stage=stage;
        this.next=null;
    }
}

class ParcelTracker{
    private StageNode head;

    void addStage(String stage){
        StageNode node=new StageNode(stage);
        if(head==null){
            head=node;
            return;
        }
        StageNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
    }

    void addCheckpoint(String after,String stage){
        StageNode temp=head;
        while(temp!=null && !temp.stage.equals(after)){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Stage not found: "+after);
            return;
        }
        StageNode node=new StageNode(stage);
        node.next=temp.next;
        temp.next=node;
    }

    void track(){
        if(head==null){
            System.out.println("Parcel tracking unavailable.");
            return;
        }
        StageNode temp=head;
        while(temp!=null){
            System.out.print(temp.stage);
            if(temp.next!=null)System.out.print(" -> ");
            temp=temp.next;
        }
        System.out.println();
    }
}

class Parcel{
    int parcelId;
    Product product;
    ParcelTracker tracker;

    Parcel(int parcelId,Product product){
        this.parcelId=parcelId;
        this.product=product;
        this.tracker=new ParcelTracker();
    }

    void addStage(String stage){
        tracker.addStage(stage);
    }
    void addCheckpoint(String after,String stage){
        tracker.addCheckpoint(after,stage);
    }
    void trackParcel(){
        System.out.print("Parcel "+parcelId+" ("+product.name+"): ");
        tracker.track();
    }
}
public class DeliveryChainManagement{
    public static void main(String[] args){

        Product laptop=new Product(101,"Laptop",45000);
        Product phone=new Product(102,"Phone",25000);
        Parcel parcel1=new Parcel(1001,laptop);
        Parcel parcel2=new Parcel(1002,phone);
        parcel1.addStage("Packed");
        parcel1.addStage("Shipped");
        parcel1.addStage("In Transit");
        parcel1.addStage("Delivered");
        parcel2.addStage("Packed");
        parcel2.addStage("Shipped");
        parcel1.addCheckpoint("Shipped","Customs Clearance");
        parcel1.trackParcel();
        parcel2.trackParcel();
    }
}
