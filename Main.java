package Sample;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Main main=new Main();

    int[] arr= new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    main.printarray(arr);
    main.printarray(main.remove_even(arr));





    }
    int[] remove_even(int[] arr1){
        int oddcounter=0;
        for(int i=0;i<arr1.length;i++){
            if (arr1[i] %2!=0) {
                oddcounter++;
            }
        }
        int result[]=new int[oddcounter];
int indx=0;
        for(int a=1;a<arr1.length;a++){
            if(arr1[a]%2!=0){
                result[indx]=arr1[a];
                indx++;
            }
        }

        return result;
    }
    void printarray(int arr[]){
    for(int i =0;i<arr.length;i++){
        System.out.print(arr[i]+"\t");


    }
        System.out.println("\n");}
    
}