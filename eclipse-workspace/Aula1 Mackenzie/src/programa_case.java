import java.util.Scanner;
public class programa_case {
    public static void main(String[] args) {
        double n1, n2;
        int op; 
        Scanner entrada = new Scanner (System.in);
        while (true){
        	System.out.println("SELECIONE A OPÇÃO DESEJADA");
            System.out.println("Digite 1 - média entre os números digitados");
            System.out.println("Digite 2 - diferença do maior pelo menor");
            System.out.println("Digite 3 - multiplicação dos números digitados");
            System.out.println("Digite 4 - divisão do primeiro pelo segundo");
            System.out.println("Digite 5 - Para sair do Programa");
         op = entrada.nextInt();
            if (op==5)                                          
                break;
            if (op<1 || op>5){                                 
                System.out.println("Opção do menu inválida");   
                continue;
            }
            System.out.println("Digite o primeiro número: ");
            n1 = entrada.nextDouble();
            System.out.println("Digite o segundo número: ");
            n2 = entrada.nextDouble();
            switch (op){
                case 1:   
                System.out.println(((n1+n2)/2));
                break;
            case 2:
                if (n1>n2) {
                             	System.out.println((n1-n2));}
                else
                {System.out.println((n2-n1));} 
                break;
            case 3:
            	System.out.println((n2*n1));
            	break;
            case 4:
            	if (n2==0)
            	{System.out.println("NÃO FOI POSSÍVEL REALIZAR A OPERAÇÃO");}
            	else
            	{System.out.println((n1/n2));}             		
             	  break;
            default:
                System.out.println("OPÇÃO INVÁLIDA");
            }
        }
    
}
}