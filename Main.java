import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int matriz[][] = {{2,3}, {4,5}};
        System.out.print("Digite o grau: ");
        int grau = scan.nextInt();

        switch (grau){
            case 0 :
                imprimir(matriz);
                break;
            case 90:
                int[][] ret90 = rotaciona(matriz);
                imprimir(ret90);
                break;
            case 180:
                int[][] ret180 = rotaciona(matriz);
                int[][] aux = rotaciona(ret180);
                imprimir(aux);
                break;
            case 360:
                imprimir(matriz);
                break;
        }
    }
   public static int[][] rotaciona(int[][] matriz){
       int largura = matriz.length;
       int altura = matriz[0].length;
       int[][] ret = new int[altura][largura];
       for (int i=0; i<altura; i++) {
           for (int j=0; j<largura; j++) {
               ret[i][j] = matriz[largura - j - 1][i];
           }
       }
       return ret;
   }
   //

   public static void imprimir(int[][] ret){
       for(int x[] : ret){
           for(int valores : x){
               System.out.print(valores);
           }
           System.out.print("\n");
       }
   }
}
