import java.util.Scanner;

public class DeniApriadiMargeShort {
    public static void tukar (int[] utama){
        for (int i=0; i<utama.length; i++) {
            for (int j=i+1; j<utama.length; j++) {
                int wadah = 0;

                if (utama[j] < utama[i]) {
                    wadah = utama[i];
                    utama[i] = utama[j];
                    utama[j] = wadah;
                }
            }
        }
    }

    public static void kiri (int[] arr) {
        for (int i=0; i<arr.length/2; i++){
            tukar(arr);
        }
    }

    public static void kanan (int[] arr) {
        int tengah = arr.length/2;
        for (int j=arr.length-1; j>=tengah; j--){
            tukar(arr);
        }
    }


    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Banyaknya Data\t: ");
        int [] data = new int [input.nextInt()];
        System.out.println();

        for(int i=0;i<data.length;i++){
            System.out.printf("Masukkan Data ke-%d\t: ",(i+1));
            data[i]=input.nextInt();
        }
        System.out.print("\nData Sebelum Diurutkan\t: ");
        for (int i=0; i<data.length; i++){
            System.out.print(data[i] + " ");
        }

        kiri(data);
        kanan(data);

        System.out.print("\nData Setelah Diurutkan\t: ");
        for (int i=0; i<data.length; i++){
            System.out.print(data[i] + " ");
        }
    }

}