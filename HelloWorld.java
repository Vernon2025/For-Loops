public class HelloWorld
{

    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    
    public void run() {
        System.out.println("Hello World!");
        for (int i = 0; i < 15; i++) { 
            System.out.println(i);  
        }
        for (int j = 10; j >= 0; j = j + (-2)) {
            System.out.println(j);    
        }
        for (int k = 10; k >= 0; k = k + (-3)) { //It will never equal down to 0
            System.out.println(k); 
        }
    }
    
    
    public static void main(String[] args)
    {        
        HelloWorld hw = new HelloWorld();
        hw.run();
    }
}
