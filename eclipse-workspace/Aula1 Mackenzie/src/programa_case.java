import java.util.Scanner;
public class programa_case {
    public static void main(String[] args) {
        double n1, n2;
        int op; 
        Scanner entrada = new Scanner (System.in);
        
        while (true){
        	 System.out.println("SELECIONE A OP��O DESEJADA");
             System.out.println("Digite 1 - m�dia entre os n�meros digitados");
             System.out.println("Digite 2 - diferen�a do maior pelo menor");
             System.out.println("Digite 3 - multiplica��o dos n�meros digitados");
             System.out.println("Digite 4 - divis�o do primeiro pelo segundo");
             System.out.println("Digite 5 - Para sair do Programa");
         op = entrada.nextInt();
            if (op==5)                                          
                break;
            if (op<1 || op>5){                                 
                System.out.println("Op��o do menu inv�lida");   
                continue;
            }
            System.out.println("Digite o primeiro n�mero: ");
            n1 = entrada.nextDouble();
            System.out.println("Digite o segundo n�mero: ");
            n2 = entrada.nextDouble();
            switch (op){
                case 1:   
                System.out.println("A m�dia dos n�meros digitados � = " + ((n1+n2)/2));
                break;
            case 2:
                if (n1>n2) {
                             	System.out.println("a diferen�a do maior pelo menor � = " + (n1-n2));}
                else
                {System.out.println("a diferen�a do maior pelo menor � = " + (n2-n1));} 
                break;
            case 3:
            	System.out.println("A multiplica��o � = " + (n2*n1));
            	break;
            case 4:
            	if (n2==0)
            	{System.out.println("N�O FOI POSS�VEL REALIZAR A OPERA��O.");}
            	else
            	{System.out.println("A divis�o � = " + (n1/n2));}             		
             	  break;
            default:
                System.out.println("Op��o inv�lida");
            }
        }
    
}
}