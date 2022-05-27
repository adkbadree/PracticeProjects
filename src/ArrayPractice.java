public class ArrayPractice {
    public static void main(String[] args) {

        // Array = used to store multiple values in a single variable


       String [] cars = {"Camero", "Charvotte", "Tesla"};

        cars [0] ="Honda";
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        // dataType [] arrayName = new dataType[size of array];

        String[] suvs = new String[3];
        suvs [0] = "CRV";
        suvs [1] = "RAV4";
        suvs [2] = "Rogue";

        System.out.println(suvs[0]);
        System.out.println(suvs[1]);
        System.out.println(suvs[2]);

        //using for loop to display elements of array

        for(int i=0; i<suvs.length; i++){
            System.out.println(cars[i]);


        }

    }


}