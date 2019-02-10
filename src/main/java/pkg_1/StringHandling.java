package pkg_1;

public class StringHandling {
    String str = " Put Any Text Here ";
    String s1 = "other text";
    String comp = "Hello";
    String comp1 = "hello";

    public void strWork() {

        int ln = str.length();
        System.out.println(ln + "\n" + str.length());
        String tr = str.trim();
        System.out.println(tr + "\n" + str.trim());
        System.out.println(str.trim().toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.trim().charAt(5));
        System.out.println(str.trim().replace('e', 'E'));
        System.out.println(str.trim().replace(" ", ""));
        System.out.println(str.trim() + " " + s1);
        // equal to:
        System.out.println(str.trim().concat(" ").concat(s1));
        System.out.println(str.trim().substring(3, 8));
        System.out.println(str.contains("Text"));
        String [] sArray = tr.split(" ") ;
        for (String s1 : sArray)
        {
            System.out.println(s1);
        }
        if (comp.equals(comp1)) System.out.println("Equal");
        else System.out.println("Not Equal");
        if (comp.equalsIgnoreCase(comp1)) System.out.println("Equal");
        else System.out.println("Not Equal");
        if (comp.compareTo(comp1)==0) System.out.println("Equal");
        else System.out.println("Not Equal");
        if (comp.compareToIgnoreCase(comp1)==0) System.out.println("Equal");
        else System.out.println("Not Equal");

    }


}
