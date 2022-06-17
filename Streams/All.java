import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class All {
	public static void main(String[] args) {
		
        List<Fruit> Fruit_list = new LinkedList<>();
        
        Fruit_list.add(new Fruit("Apple", 17, 234, "red"));
        Fruit_list.add(new Fruit("grapes", 15, 230, "black"));
        Fruit_list.add(new Fruit("mango", 150, 254, "Yellow"));
        Fruit_list.add(new Fruit("orange", 120, 158, "orange"));
        
        //1. Fruits with calories less than 100
       
        System.out.println("Fruits with calories less than 100");
        
        Fruit_list.stream().filter(x -> x.getCalories() < 100).map(Fruit::getName).forEach(System.out::println);
        
        //2. Sorting fruits according to their color
        
        System.out.println("Sorting fruits according to their color");
       
        Fruit_list.stream().sorted(Comparator.comparing(Fruit::getColor)).map(Fruit::getName).forEach(System.out::println);
        
        //3. Only red color fruits
       
        System.out.println("Only red color fruits");
        
        Fruit_list.stream().filter(x -> x.getColor().contains("red")).forEach(System.out::println);


        List<News> News_list = new LinkedList<>();
        
        News_list.add(new News(12, "sheerin", "This is good", "Time spent well"));
        News_list.add(new News(12, "sunny", "Well done budget", "Good Presentation"));
        News_list.add(new News(12, "maahir", "Very well done", "This was amazing"));
        News_list.add(new News(13, "sulthana", "This was informational budget", "Liked the author"));
        
        //4. NewsId with maximum comment
        
        System.out.println("News ID with maximum comment");
        News_list.stream().max(Comparator.comparing(News::getCommentByUser).reversed()).ifPresent(System.out::println);
        
        //5. Budget Count
       
        System.out.println("Counting the word budget in comment");
        int count = (int) News_list.stream().filter(x -> x.getCommentByUser().contains("budget")).count();
        System.out.println("No. of time word Budget Appeared: " + count);
       
        //6. User with  Maximum comment
       
        Optional<String> max = News_list.stream().map(News::getCommentByUser).max((i, j) -> i.compareTo(j));
        System.out.println(max.get());
       
        //7. print get comment by user
        
        System.out.println("7.print get comment by user");
        News_list.stream().max(Comparator.comparing(News::getNewsId).reversed()).map(News::getCommentByUser).ifPresent(System.out::println);


        List<Traders> Trader_list = new LinkedList<>();
        Trader_list.add(new Traders("sheerin", "pune"));
        Trader_list.add(new Traders("sunny", "Indore"));
        Trader_list.add(new Traders("maahir", "delhi"));
        Trader_list.add(new Traders("sulthana", "delhi"));
        Trader_list.add(new Traders("munni", "Ahemadabad"));
        Trader_list.add(new Traders("honey", "pune"));
       
        //9. Unique cities where trader work from
        System.out.println("Unique cities where trader work from");
        Trader_list.stream().map(Traders::getCity).distinct().forEach(System.out::println);
       
        //10. Trader who are in pune
       
        System.out.println("Trader in pune");
        Trader_list.stream().filter(x -> x.getCity().contains("pune")).forEach(System.out::println);
       
        //11. Trader name sorted alphabetical
       
        System.out.println("Trader name sorted alphabetical");
        Trader_list.stream().sorted(Comparator.comparing(Traders::getName)).forEach(System.out::println);
        
        //12. Are any traders based in indore
       
        boolean checkindore = Trader_list.stream().anyMatch(x -> x.getCity().contains("Indore"));
        System.out.println("Are there any trader based in indore: " + checkindore);

        List<Transaction> Trans_list = Arrays.asList(
                new Transaction(new Traders("Maahir", "Delhi"), 2012, 4500),
                new Transaction(new Traders("sheerin", "Delhi"), 2011, 4800),
                new Transaction(new Traders("sunny", "Indore"), 2011, 4400));
        
        //8. Transaction of a particular year
       
        System.out.println("Transaction of year 2011");
        Trans_list.stream().filter(x -> x.getYear()==2011).sorted(Comparator.comparing(Transaction::getValue)).forEach(System.out::println);

        //13. Transaction from traders living in delhi
        
        System.out.println("Transaction from traders living in delhi");
        Trans_list.stream().filter(x -> x.getT().getCity().contains("Delhi")).map(Transaction::getValue).forEach(System.out::println);

        //14. Highest transaction value
        
        System.out.println("Highest Transaction value");
        Trans_list.stream().sorted(Comparator.comparing(Transaction::getValue).reversed()).limit(1).forEach(System.out::println);
       
        //15. Transaction with smallest value
       
        System.out.println("Transaction with smallest value");
        Trans_list.stream().sorted(Comparator.comparing(Transaction::getValue)).limit(1).forEach(System.out::println);
    }

}
