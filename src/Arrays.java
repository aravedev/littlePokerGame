


public class Arrays {
    public static void main(String[] args) {
        String[] cities = {"Paris","London","Madrid"};

        for(int i=0; i<cities.length; i++){
            System.out.println(cities[i]);
        }

        int[] number = {13,7,300,2,56};
        int max = number[0];
        int min= number[0];

        for(int i=0; i<number.length; i++){
            if(number[i]>max){
                max = number[i];

            }

            if(number[i]<min){
                min = number[i];

            }

        }

        System.out.println(max);
        System.out.println(min);
    }
}
