package gold;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SampleGroupingBy {

	enum ItemType {
		BOOK, MAGAZINE, DVD
	}
	
	private int id;
	private ItemType type;
	private String name;
	private int price;
	
	public SampleGroupingBy(int id, ItemType type, String name, int price) {
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
		
		
		List<SampleGroupingBy> list = 
				Arrays.asList(
						new SampleGroupingBy(1, ItemType.BOOK, "Java", 1980),
						new SampleGroupingBy(1, ItemType.BOOK, "Lamda", 2980),
						new SampleGroupingBy(1, ItemType.MAGAZINE, "Software", 3980),
						new SampleGroupingBy(1, ItemType.MAGAZINE, "Test", 4980)
				);		
		Map<ItemType, List<SampleGroupingBy>> group =
				list.stream().collect(
						Collectors.groupingBy(SampleGroupingBy::getType));
		
		System.out.println(group);
		
		
		Map<ItemType, Integer> group2 =
				list.stream().collect(
						Collectors.groupingBy(SampleGroupingBy::getType,
								Collectors.summingInt(SampleGroupingBy::getPrice)));

		
		System.out.println(group2);
		
		
		Map<Boolean, List<SampleGroupingBy>> group3 =
				list.stream().collect(
						Collectors.partitioningBy(item -> item.getPrice() > 2000));
		
		System.out.println(group3 );
		
		
		
	}

}
