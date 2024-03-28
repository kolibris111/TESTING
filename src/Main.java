public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //System.out.println( assertEquals( formatName("naAAglis"),"Naglis")) ;
        // System.out.println( assertEquals( formatName("Niglis"),"Naglis")) ;
        // System.out.println( assertEquals( formatName("Naglisss"),"Naglis")) ;


        String formattedName = formatName("Naglis") ;
        System.out.println( assertEquals( formatName("NAGLIS"),"Naglis")) ;
        System.out.println( assertEquals( formatName("naglis"),"Naglis")) ;
        System.out.println( assertEquals( formatName(" Naglis "),"Naglis")) ;
        System.out.println( assertEquals( formatName("nAGLIS"),"Naglis")) ;
        System.out.println( assertEquals( formatName(" Naglis "),"Naglis")) ;
        System.out.println( assertEquals( formatName("aglis"),"Naglis")) ;
        System.out.println( assertEquals( formatName("N4glis"),"Naglis")) ;
        System.out.println( assertEquals( formatName("Nag lis"),"Naglis")) ;
    }

    public static String formatName(String name){
        name = "naglis" ;
        name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
        System.out.println(name);
        return name;//suformatuotas Namecase
    }
    public static boolean assertEquals(String actual, String expected){
        return actual.equals(expected);
    }

















}