
import java.util.*;


/*Question : 
			 You are working for an ecommerce company and have been asked to
  			 create an instance of a shopping cart where you can add multiple items

 */
/* Cart 
   ----
   ID    // 
   Name 
   Price
   Tags

*/

public class Item{
	private String ID;
	private String name;
	private double price;
	private int quantity;
	private String[] tags;

	public Item(String name, double price, int qunaity, String[] tags){
		this.ID = UUID.generateID().toString();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.tags = tags;
	}

	public String getID(){ return this.ID;}
	public String getName(){ return this.name; }
	public String getPrice(){ return this.price; }
	public String getQuantity(){ return this.quantity; }
	public String getTags(){ return this.tags};

	public void setName(String name){ this.name = name;}
	public void setPrice(double price){ this.price = price; }
	public void setQuantity(int quantity){ this.quantity = quantity; }
	public void setTags(String[] tags){ this.tags = tags; }
}
public class Cart{

	private Item[] items;
	private int count;

	public Cart(Item[] items){
		this.items = items;
		this.count = 0;
	}

	public void addItem(items){
		items[count] = items;
		count++;
	}

	public void purchase(){
		for(Item item: items){
			System.out.println(" PURCHASED ");
			System.out.println(" --------- ");

			System.out.println("Name : " + item.getName());
			System.out.println("Price : " + item.getPrice());
			System.out.println("Quantity : " + item.getQUantity());
			System.out.print("Tags : ");
			for(String tag: item.getTags()){
				System.out.println(tag);
			}
		}
	}
}


public class Solution{

	public static void main(String[] args){

		Item item1 = new Item("Iphone", 500.0, 5, new String[]{
			"Phone",
			"Eletronics"
		});

		Item item2 = new Item("Chromebook", 300.0,3, new String[]{
			"Computer",
			"Eletronics",
		})

		Item item3 = new Item("Nike shorts", 15.0,1, new String[]{
			"Clothes",
			"Shorts",
			"Nike"
		})

		Item[] items = new Item[3];
		items[0] = item1;
		items[1] = item2;
		items[2] = item3;

		Cart myCart = new Cart(items);
		myCart.add(new Item( "Water Bottle", 5.0, new String[]{
			"Water",
			"Drinking"
		}));

		myCart.purchase();
	}
}