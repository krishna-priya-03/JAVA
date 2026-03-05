public class string1
{
    public static void main (String args[])
    {
     String str1="helloo"; 
     String str2="hai how are you ,suganno"; 
     int length=str1.length(); 
    System.out.println("length of string is:"+length); 
     

    //string concatenation
    String str3=str1.concat(str2);
    System.out.println("string after concatenation is:"+str3);
     
    String str4=str1+str2;
     System.out.println("string after concatenation is:"+str4);

//string comparison

    String str5="HELLOO";
    System.out.println("string after compare is:"+str5.compareTo(str1));

    //string comparison using compareTo
    int index=str2.indexOf('h');
    System.out.println("index of str1 in str2 is:"+index);

    //upper case
    String str6=str1.toUpperCase();
    System.out.println("string in upper case is:"+str6);

    //lower case
    String str7=str1.toLowerCase();
    System.out.println("string in lower case is:"+str7);

    //replace
    String str8=str1.replace('o','a');
    System.out.println("string after replace is:"+str8);

    //compareto ignore case
    int result=str1.compareToIgnoreCase(str5);
    System.out.println("string after compare ignore case is:"+result);


    //substring
    String str9=str2.substring(0,6);
    System.out.println("substring of str2 is:"+str9);

    //trim
    String str10="   hello world   ";
    String str11=str10.trim();
    System.out.println("string after trim is:"+str11);

    //byte ascii
    byte[] ascii = {75,71,70};
    String str12=new String(ascii);
    System.out.println("string from ascii values is:"+str12);


        
    byte[] bytearray = str1.getBytes();
    System.out.println("ascii value of str1 is:"+java.util.Arrays.toString(bytearray));
    }
        
    }