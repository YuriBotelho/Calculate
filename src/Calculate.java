public class Calculate {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        if(args[0].equals("somar")){
            sum(x,y);
        }
        if(args[0].equals("subtrair")){
            minus(x,y);
        }
        if (args[0].equals("multiplicar")){
            multi(x,y);
        }
        if(args[0].equals("dividir")){
            div(x,y);
        }
    }
    static void sum(int x, int y){
        System.out.println("O resultado é: "+ (x+y));
    }
    static void minus(int x, int y){
        System.out.println("O resultado é: "+ (x-y));
    }
    static void multi(int x, int y){
        System.out.println("O resultado é: "+ (x*y));
    }
    static void div(int x, int y){
        System.out.println("O resultado é: "+ (x/y));
    }
}