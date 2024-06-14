import java.util.Scanner;
//引数（ジャンルtype）を受け取って曲の配列を返す
//
public class Music {
	
	//曲の配列
	//Kpop　
	String [] kpop = {"TT from Twice","ELEVEN from IVE", "OMG from Newjeans",
		"DNA from BTS", "Pretty U from SEVENTEEN"};
	//Jpop 
	String [] jpop = {"白日 from King&Gun","マリゴールド from あいみょん","アイドル from YOASOBI", 
		"シンデレラボーイ from Saucy Dog","きらり from 藤井風"};
	//洋楽 
	String [] wpop = {"Feather from Sabrina Carpenter", "Calm down from Taylor Swift", "Vampire from Olivia Rodrigo",
			"bad guy from Billie Eilish", "Happily from One Direction"};
	
	public String[] type(String typeName) {
		if(typeName.equals("kpop")) return kpop;
		else if (typeName.equals("jpop")) return jpop;
		else return wpop;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Music music = new Music();
		
		String[] typeName = {"kpop", "jpop", "wpop"};
		System.out.println("ジャンルを選んでください");
		for(int i=0; i<typeName.length; i++) {
		System.out.println(typeName[i]);
		}
		String name = sc.nextLine();
		String[] return_Name = music.type(name);
		System.out.println(name+"のおすすめの曲はこちらです！！");
		for(int i=0; i<return_Name.length; i++) {
			System.out.println(return_Name[i]);
		}
	}

}
