import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Keyvaluepair {
   public static void main(String[] cmd_lineParams) {
      Map<String, String> map = new HashMap<>(5);
      map.put("name1", "value1");
      map.put("name2", "{\"x\": \"y\"}");
      map.put("name3", "value3");
      map.put("name4", "value4");
      map.put("name5", "value5");
      forLoop(map);
      resetAllValues(new HashMap<String, String>(map));
      streamy(new HashMap<String, String>(map));
   }
   private static final Matcher matcher = Pattern.compile("\"").matcher("ignored input");
   private static final void forLoop(Map<String, String> map) {
      StringBuilder builder = new StringBuilder();
      for(Map.Entry<String, String> entry : map.entrySet()) {
         String value = matcher.reset(entry.getValue()).replaceAll("\\\\\"");
         builder.append("--").append(entry.getKey()).append(" \"").append(value).append("\"");
      }
      System.out.println("forLoop: " + builder.toString());
   }
   private static final void resetAllValues(Map<String, String> map) {
	      map = map.entrySet().stream()
	         .collect(Collectors.toMap(entry -> entry.getKey(),
	                                   entry -> matcher.reset(entry.getValue()).replaceAll("\\\\\\\"")));
	      StringBuilder builder = new StringBuilder();
	      for(Map.Entry<String, String> entry : map.entrySet()) {
	         builder.append("--").append(entry.getKey()).append(" \"").append(entry.getValue()).append("\"");
	      }
	      System.out.println("resetAllValues: " + builder.toString());
	   }
	   private static final void streamy(Map<String, String> map) {
	      StringBuilder builder = new StringBuilder();
	      map.forEach((k,v) -> builder.append(
	         builder.append("--").append(k).append(" \"").append(
	            matcher.reset(v).replaceAll("\\\\\"")).append("\"")));
	      System.out.println("streamy: " + builder.toString());
	   }
	}
