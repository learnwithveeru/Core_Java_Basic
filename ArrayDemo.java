public class ArrayDemo {
    public static void main(String[] args) {
        System.out.println("Hello Arrays Example");
        int arr[]={10,2};
        int [] arr1;
        //int [6] arr2; error: not a statement
        System.out.println(arr.length);
        int newarr[]=new int[10];
        System.out.println(newarr.length);

       // int newarr1[]=new int[];error: array dimension missing
       int newStr[]=new int[34];
       System.out.println("new Str size "+newStr.length);
// •	If we are taking array size with -ve int value then we will get runtime exception saying NegativeArraySizeException
     //int newarr2[]=new int[-5]; 
    // System.out.println("length of newarr2[]"+newarr2);
     // •	The allowed data types to specify array size are byte, short, char, int. 
      int a[]=new int['a'];
      System.out.println("length of a[] "+a.length);
    }
}
