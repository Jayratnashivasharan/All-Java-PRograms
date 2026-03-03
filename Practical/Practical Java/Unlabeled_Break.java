
public class Unlabeled_Break {
    public static void main (String as[]){
    
    String[]arr={"Jay","Shubbb","Apuuuuu","Shreya","Anzuuu"};
    String searchName="Anzuuu";
    int j;
    boolean FoundNmae=false;
    for(j=0;j<arr.length;j++){
        if(arr[j]==searchName){
            FoundNmae=true;
            break;
        }
    }
    if(FoundNmae){
        System.out.println("this Nmae"+searchName+"is Found in index"+j);
    }
    else 
    {
        System.out.println("this Name"+searchName+"Is not Found in the array");
    }
}
}