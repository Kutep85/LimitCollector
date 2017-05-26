package HomeTask02_2;

public class Main {
	public static void main (String[] args) {
		LimitCollector collector = new LimitCollector(25);
		for (int i = 0; i < 25; i++){
			int a = (int) (Math.random() * 100);
			System.out.println(a);
			collector.add(a);
		}
		collector.print();
		for (int i = 0; i < 10; i++){
			int a = (int) (Math.random() * 100);
			System.out.println(a);
			collector.add(a);
		}
		collector.print();
	}
}
