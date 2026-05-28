public class VariableTypeDemo {
    int instanceVar=10;
    boolean instanceFlag;
    public static void main(String[] args) {
        // first way to access the instance variable..
        VariableTypeDemo vtd=new VariableTypeDemo();
        System.out.println(vtd.instanceVar);
        // end first way..
         // second way to access the instnace variable..
         vtd.getInstanceVar();
    }
   
    public void getInstanceVar(){
        System.out.println(instanceVar);
        System.out.println(instanceFlag);
    }
}
