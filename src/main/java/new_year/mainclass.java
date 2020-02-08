package new_year;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class mainclass {
	
	public static void updateObj(String str,eclairs e,aasha a,laddu l,gulabjamun gu,kalakan k,gift g) {
		if(str.equals("aasha")) {
			a.update();
			g.updatewt(a.wt);
	}
		else if(str.equals("eclairs")){
			e.update();
			g.updatewt(e.wt);
		}
		else if(str.equals("gulabjamun")) {
			gu.update();
			g.updatewt(gu.wt);
		}
		else if(str.equals("kalakan")) {
			k.update();
			g.updatewt(k.wt);
		}
		else if(str.equals("laddu")) {
			l.update();
			g.updatewt(l.wt);
		}
	}
	public static void printGiftItems(String gift) {
		if(gift.equals("chocolate")) {
			System.out.println("eclairs,aasha");
		}
		else{
			System.out.println("gulabjamun,kalakan,laddu");
		}
	}
	public static void main(String[] args)throws IOException {
BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
gift g =new gift();
eclairs e = new eclairs();
aasha a = new aasha();
laddu l = new laddu();
gulabjamun gu=new gulabjamun();
kalakan k = new kalakan();
System.out.print("Enter the name of the gift:");
String gift1=inp.readLine();
System.out.print("Enter the number of "+gift1+":");
int n = Integer.parseInt(inp.readLine());
System.out.print("\nselect one of the "+gift1+":");
printGiftItems(gift1);
for(int i=0;i<n;i++) {
	System.out.println();
	
	System.out.print(gift1+" name:");
	String str = inp.readLine();
	updateObj(str,e,a,l,gu,k,g);
	
}
System.out.print("Enter the name of the gift:");
String gift2=inp.readLine();
System.out.print("Enter the number of "+gift2+":");
int m = Integer.parseInt(inp.readLine());
System.out.print("\nselect one of the "+gift2+":");
printGiftItems(gift2);
for(int i=0;i<m;i++) {
System.out.println();
	
	System.out.print(gift2+" name:");
	String str = inp.readLine();
	updateObj(str,e,a,l,gu,k,g);
}

System.out.print("Total weight of the gifts:");
System.out.println(g.weight);
System.out.println("Total gifts are");
System.out.print("Eclairs:");
System.out.println(e.count);
System.out.print("Aasha:");
System.out.println(a.count);
System.out.print("Laddu:");
System.out.println(l.count);
System.out.print("Kalakan:");
System.out.println(k.count);
System.out.print("Gulabjamun:");
System.out.println(gu.count);
System.out.print("Enter the range of the price for chocolate:");
int rc = Integer.parseInt(inp.readLine());
System.out.println("Find chocolates of price less than "+rc);
if(e.count>0 && e.cp<rc) {
	System.out.print("eclairs\t");
}
	if(a.count>0 && a.cp<rc) {
		System.out.print("Aasha");
	}
	System.out.println();
System.out.println("Enter the range of the price for sweets");
int rs = Integer.parseInt(inp.readLine());
System.out.println("\nFind sweets of price less than "+rs);
if(k.count>0 && k.cp<rs) {
	System.out.print("Kalakan\t");
}
if(l.count>0 && l.cp<rs) {
	System.out.print("Laddu\t");
}
if(gu.count>0 && gu.cp<rs) {
	System.out.print("gulabjamun");
}
	}
	
}
