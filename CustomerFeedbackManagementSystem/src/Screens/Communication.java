package Screens;

//Holds darkness and language information for all screens
public class Communication {

    //Holds and sets language information as English
    private static boolean isTurkish = false;

    //Holds and sets darkness information as Dark
    private static boolean isDark = false;

    //Holds customer ID
    private static int customerID;

    //Returns true if language is Turkish otherwise returns false
    public static boolean isTurkish() {
        return isTurkish;
    }

    //Sets language as Turkish or English
    public static void setLanguage(boolean choice) {
        isTurkish = choice;
    }

    //Returns true if darkness has choosen otherwise returns false
    public static boolean isDark() {
        return isDark;
    }

    //Sets darkness as Dark or Light
    public static void setDarkness(boolean choice) {
        isDark = choice;

    }
    
    //Returns customer ID
    public static int getCustomerID() {
        return customerID;

    }
    
    //Sets customer ID
    public static void setCustomerID(int ID) {
        customerID = ID;
    }

}
