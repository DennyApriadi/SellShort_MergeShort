import java.util.Scanner;
public class DeniApriadiShellSort {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int jarak,tukar;
        boolean end;

        System.out.print("Masukkan jumlah data\t: ");
        int [] data=new int [input.nextInt()];
        System.out.println();

        for(int i=0;i<data.length;i++){
            System.out.printf("Masukkan data ke-%d\t: ",(i+1));
            data[i]=input.nextInt();
        }
        System.out.print("\nData Sebelum Diurutkan\t: ");
        for(int i=0;i<data.length;i++){
            System.out.printf("%d ",data[i]);
        }

        jarak = data.length;
        while (jarak>1){
            jarak/=2;
            end=false;
            while (end==false){
                end=true;
                for(int j=0;j<data.length-jarak;j++){
                    if (data[j]>data[j+jarak]){
                        tukar=data[j];
                        data[j]=data[j+jarak];
                        data[j+jarak]=tukar;
                        end=false;
                    }
                }
            }
        }
        System.out.print("\nData Setelah Diurut\t\t: ");
        for(int i=0;i<data.length;i++){
            System.out.printf("%d ",data[i]);
        }
    }
}