package problem2;

import java.util.HashSet;

public class TestSlug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Slug s1 = new Slug();
		Slug s2 = new Slug();
		System.out.println(s1.equals(s2));
		System.out.println(s1.size);
		s1.grow();
		System.out.println(s1.size);
		System.out.println(s1.equals(s2) + "\n");
		
		EnemySlug ms1 = new EnemySlug(100, 50);
		EnemySlug ms2 = new EnemySlug(100, 50);
		System.out.println(ms1.equals(ms2));
		System.out.println(ms1.size);
		ms1.grow();
		System.out.println(ms1.size);
		System.out.println(ms1.equals(ms2));
		
		s1.size -= 100;
		ms1.size -= 150;
		HashSet<Slug> slugs = new HashSet<Slug>();
		slugs.add(s1);
		slugs.add(s2);
		slugs.add(ms1);
		slugs.add(ms2);
		System.out.println();
		for(Slug slug: slugs) {
			System.out.println(slug);
		}
	}

}
