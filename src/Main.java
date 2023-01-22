public class Main {
    public static void main(String[] args) {
        int m = 0;
        int a = 0;
        double s = 0;
        float randomNumbers []={2.5f, 2.7f, -5.2f, 2.9f, 3.5f, 5.7f, 1.6f, 5.6f};
        for (double f : randomNumbers)
        {
            if (f<0){
                m++;
            }
            if (m>0 && f>0){
                s=s+f;
                a++;
            }
            System.out.println(s + "/" + a + "=" + (s/a));
        }
    }
}