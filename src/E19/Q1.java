package E19;
//Create Array Access elements


public class Q1 {
    public static void main(String[] args) {
        // Q 01)create array
        //int array[] = new int[20];
        int array[] = {2,4,5,6,7,8,12,10,9,15};

        //Q 02)Read array elements
        for (int i=0; i< array.length; i++){
            System.out.println(array[i]);
        }

        //Q 03)Interchange 
        int i = 2;
        int j = 3;
        int temp;

        temp = i;
        i = j;
        j = temp;
        System.out.println("change "+temp+" into "+i);
        System.out.println("change "+i+" into "+j);

        //Q 04)Print Kth element
        k=5;
        //printing the 6th element
        system.out.println(array[k]);
        
        //Q 05)Delete Kth elemnt
        array[k]='';
        
    }
}
