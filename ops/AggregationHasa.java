class professor {

    String name;
    professor(String name){
        this.name=name;
    }

}
class collage{
    String collagename;
    String professorname;
    professor p;

    collage(String collagename, professor p){
        this.collagename=collagename;
        this.p=p;
    }

    void display(){
        System.out.println("Collage:-" + collagename+" "+ "professorname:-"+p.name);
    } 

}

public class AggregationHasa {

    public static void main(String[] args) {
        professor p=new professor("Pankaj Tripathi");
        collage c=new collage("silver oak", p);
        c.display();
    }
    
}
