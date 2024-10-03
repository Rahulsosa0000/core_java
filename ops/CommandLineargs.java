
public class CommandLineargs {
    public static void main(String[] args) {
        
        if(args.length==0){
            System.out.println("No command line argument.");
        }else{
            System.out.println("Commandline argument:-");
        }
        for(int i=0;i<args.length;i++){
            System.out.println("argument"+ (i+1)+ " "+args[i]);
        }
    }
}
