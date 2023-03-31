package day21_multiDimensionalArray;
public class MultiDimensionalArrayPractice3 {
    public static void main(String[] args) {

        int[][][] arr3D1 = { {{1,2}, {3, 4, 5}} ,  {{6, 7, 8, 9},{12, 13, 14}} };
        int[][][] arr3D2 = { {{1,2}, {3, 4, 5}} ,  {{6, 7, 8, 9},{12, 13, 14}} };
        int[][][] arr3D3 = { {{1,2}, {3, 4, 5}} ,  {{6, 7, 8, 9},{12, 13, 14}} };

        int[][][][] arr4D={arr3D1,arr3D2,arr3D3};

        for(int[][][] each3D : arr4D){            //4D'den aldigin her 3D bir sonraki loop'daki data structure'in oluyor
            for(int[][] each2D : each3D ) {       //4D ise 4 loop gerekiyor element'e ulasmak icin
                 for (int[] each1D : each2D) {
                     for (int eachElement:each1D){
                         System.out.println(eachElement);
                     }
                 }
            }
        }
    }
}