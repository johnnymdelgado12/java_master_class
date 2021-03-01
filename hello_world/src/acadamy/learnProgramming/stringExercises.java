package acadamy.learnProgramming;

public class stringExercises {
    public static void main(String[] args) {
        // Eight primitive data types
        //byte
        //int
        //short
        //long
        //double
        //float
        //char
        //boolean
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println(myString);
        myString = myString + " \u00A9 2021";
        System.out.println(myString);

        String myNumberString = "250.55";
        myNumberString = myNumberString + "49.95";
        System.out.println(myNumberString ); 
        
        String myLastString = "10";
        int myInt = 50;
        myLastString = myLastString + myInt;
        System.out.println(myLastString);
        
    }
    
}
