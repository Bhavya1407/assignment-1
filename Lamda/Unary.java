import java.util.ArrayList;
import java.util.function.UnaryOperator;
class Op implements UnaryOperator<String> {
   public String apply(String str) {
      return str.toUpperCase();
   }
}
public class Unaryoperator {
   public static void main(String[] args) throws CloneNotSupportedException {
      ArrayList<String> list = new ArrayList<>();
      list.add("ShEErin");
      list.add("sUnny");
      list.add("MaaHIR");
      list.add("SULTHana");
      list.add("MUNNi");
      System.out.println("Contents of the list: "+list);
      list.replaceAll(new Op());
      System.out.println("Contents of the list after replace operation: \n"+list);
   }
}
