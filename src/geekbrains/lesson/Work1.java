package geekbrains.lesson;

public class Work1 {

    public static void main(String[] args) {
		int a = -11;
		int b = 22;
		int c = 33;
		int d = 44;
		int year = 2400;
		String Name = "Александр";
		System.out.println("Ответ на первый вопрос: " + Frst(a,b,c,d));
		System.out.println("Ответ на второй вопрос: " + Scnd(a,b));
		System.out.println("Ответ на третий вопрос: " + Thrd(a));
		System.out.println("Ответ на четвертый вопрос: " + Four(Name));
		System.out.println("Ответ на пятый вопрос: " + Five(year));
    }
    public static double Frst(double a, double b, double c, double d) {
		return a * (b + (c / d));
	}
	public static boolean Scnd(int a, int b){
    	boolean ask;
    	ask = 10 <= (a + b) && (a + b) <= 20;
    	return ask;
	}
	public static String Thrd(int a){
    	String asker;
    	if (a >= 0){
    		asker = "Число положительное";
    		return asker;
		} else asker = "Число отрицательное";
    	return asker;
	}
	public static String Four(String Name){
    	String ask2 = "Привет, " + Name + "!";
    	return ask2;
	}
	public static String Five(int year){
		String ask3;
    	if (year % 4 == 0 & year % 100 != 0) {
			ask3 = "Год " + year + " високосный";
		} else if (year % 400 == 0) {
    		ask3 = "Год " + year + " високосный";
		} else ask3 = "Год " + year + " обычный";
    	return ask3;
	}
}
