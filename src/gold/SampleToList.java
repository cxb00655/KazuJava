package gold;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SampleToList {

	
	enum ItemType {
		BOOK, MAGAZINE, DVD
	}
	
	private int id;
	private ItemType type;
	private String name;
	private int price;
	
	public SampleToList(int id, ItemType type, String name, int price) {
		super();
		this.id=id;
		this.type=type;
		this.name=name;
		this.price=price;
	}
	
	public int getId() {
		return id;
	}

	public ItemType getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
	

	@Override
	public String toString() {
		// TODO 自動生成されたメソッド・スタブ
		return "Item [id=" + id + ", type~" + type + ", name=" + name + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		List<SampleToList> list = Arrays.asList(
				new SampleToList(1, ItemType.BOOK, "Java", 1980),
				new SampleToList(2, ItemType.BOOK, "Lamda", 2980),
				new SampleToList(3, ItemType.MAGAZINE, "Software", 980),
				new SampleToList(4, ItemType.MAGAZINE, "Test", 1280)
				
				);
		
		List<SampleToList> books = list.stream()
				.filter(item -> item.getType() == ItemType.BOOK)
				.collect(Collectors.toList());
		
		books.forEach(System.out::println);
		
		
		Set<SampleToList> booksSet = list.stream()
				.filter(item -> item.getType() == ItemType.MAGAZINE)
				.collect(Collectors.toSet());
		
		booksSet.forEach(System.out::println);
		
		Map<String, SampleToList> map=
				list.stream().collect(Collectors.toMap(
						SampleToList::getName, item->item));
		
		map.keySet().stream().forEach(System.out::println);
		
		
		

	}

}
