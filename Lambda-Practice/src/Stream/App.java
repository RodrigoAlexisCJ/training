package Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) throws Exception {
		IntStream.range(1, 10).skip(5).forEach((a)->System.out.println(a));
		int sum = IntStream.range(1, 5).sum();
		System.out.println(sum);
		
		Stream.of("Hello","bottle","Africa").sorted()
		.findFirst().ifPresent((a)-> System.out.println(a));
		
		String[] item = {"car","computer","toothpaste","box","pencil","tent","door","toy"};
		Stream.of(item).filter((x)->x.startsWith("t"))
		.sorted().forEach((a)-> System.out.println(a+", "));
		
		Arrays.stream(new int[] {2,4,6,8,10})
		.map((a)->a*a)
		.average().ifPresent((n)->System.out.println(n));
		
		List<String> list = new ArrayList<>(List.of("Computer","Toothpaste","Box",
				"Car","Pencil","Tent"));
		list
		.stream()
		.map((a)-> a.toLowerCase())
		.filter((a)->a.startsWith("c"))
		.sorted()
		.forEach((a)-> System.out.println(a));
		
		try (Stream<String> lines= Files.lines(Paths.get("Files/wordFile.txt"))){
			lines.sorted().filter((a)->a.length()>6).forEach((a)->System.out.print(a+", "));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<String> words= Files.lines(Paths.get("Files/wordFile.txt"))
				.filter((a)->a.contains("th"))
				.collect(Collectors.toList());
			System.out.println("");
			words.forEach((a)->System.out.print(a+", "));
			System.out.println("");
			
		Stream<String> rows= Files.lines(Paths.get("Files/stockDataCsv.txt"));
		int rowCount=(int)rows
				.map((a)->a.split(","))
				.filter((a)->a.length>3).count();
		System.out.println(rowCount+" good rows");
		rows.close();
		
		Stream<String> row= Files.lines(Paths.get("Files/stockDataCsv.txt"));
		row.map((a)->a.split(","))
				.filter((a)->a.length>3)
				.filter((a)->Integer.parseInt(a[1].trim())>15)
				.forEach((a)->System.out.println(a[0].trim()+" "+a[2].trim()+" "+a[3].trim()));
		row.close();
		
		
	}

}
