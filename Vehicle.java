public class Vehicle {
    double speed;
     public static void go(){
        System.out.println("I am moving");
    }
    public static  void stop(){
        System.out.println("I am stopping");
    }
    public static void array(){
   


    
    double [][] data = new double[3] [];
    data[0]=new double [4];
    data[1]=new double [10];
    data[2]=new double [5];
    for(int i = 0; i<data.length ; i++){
        for(int j = 0; j<data.length ; j++)
     System.out.println(data[i][j]);
     }
    }
}
