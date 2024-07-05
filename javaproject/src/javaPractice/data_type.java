package javaPractice;

public class data_type {
    public static void main(String[] args) {
        int score = 90;
        double temperature = 25.5;
        char grade = 'A';
        boolean isRaining = false;
        int[] numbers = { 1, 2, 3, 4, 5 };
        String[] names = { "Alice", "Bob", "Charlie" };
        System.out.println(score+" "+temperature+" "+grade+" "+isRaining);

        System.out.println("Integer type Arrays: Numbres");
        System.out.print("{");
        for(int i=0;i<numbers.length;i++)
        {
            
            System.out.print(numbers[i]+" ");
        }
        System.out.print("}");
        System.out.println(" ");
        System.out.print("{");
        for(int i=0;i<names.length;i++)
        {
           
            System.out.print(names[i]+" ");
        }
        System.out.print("}");
    }

}
