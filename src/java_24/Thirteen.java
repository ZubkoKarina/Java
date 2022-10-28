package java_24;

class Thirteen {
    public static void main(String arguments[]) {
        int[] thirteens = new int[400];
        int numFound = 0;
        
        int candidate = 1;
        while (numFound < 400) {
            if (candidate % 13 == 0) {
                thirteens[numFound] = candidate;
                numFound++;
            }
            candidate++;
        }
        System.out.println("First 400 multiples of 13:");
        for (int i = 0; i < 400; i++) {
           System.out.print(thirteens[i] + " ");
        }
    }
}
