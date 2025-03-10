import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        Hero hulk = new Hero("Hulk", 49);
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero thor = new Hero("Thor", 1501);
        Hero vision = new Hero("Vision", 3);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero doctorStrange = new Hero("Doctor Strange", 42);
        
        Flower lily = new Flower("Lily");
        Flower tulip = new Flower("Tulip");
        Flower begonia = new Flower("Begonia");
        Flower violet = new Flower("Violet");
        Flower rose = new Flower("Rose");

        // TODO 1 : Create a TreeMap where :
        // Hulk, Thor and Scarlet Witch have a Rose
        // Vision has a Tulip
        // Captain America has a Lily
        // Doctor Strange and Black Widow have a Violet
        Comparator<Hero> comparator = new Comparator<Hero>() {
            @Override
            public int compare(Hero orig, Hero compare) {
                return orig.getName().compareTo(compare.getName());
            }
        };
        
        Map<Hero, Flower> treeHeroes = new TreeMap<>(comparator);
        treeHeroes.put(hulk, rose);
        treeHeroes.put(thor, rose);
        treeHeroes.put(scarletWitch, rose);        
        treeHeroes.put(vision, tulip); 
        treeHeroes.put(captainAmerica, lily);         
        treeHeroes.put(doctorStrange, violet); 
        treeHeroes.put(blackWidow, violet);        
        
        // TODO 2 : Print if `begonia` is contained in the TreeMap
        System.out.println("Party contient begonia : " + treeHeroes.containsValue(begonia));
        
        // TODO 3 : For each hero, alphabetically, print the corresponding flower
        for (Hero hero : treeHeroes.keySet()) {
        	Flower flower = treeHeroes.get(hero);
        	System.out.println(hero.getName() + " : " + flower.getName());        	
        }
        
    }
}
