
package Aula4;

public class TestaCliente {
    public static void main(String[] args) {
       
        Pessoa objPessoa1 = new Pessoa();
        
        objPessoa1.setNome("Guilherme");
        objPessoa1.setCidade("Teutonia");
        objPessoa1.setIdade(17);
        objPessoa1.setAluno(true);

        Pessoa objPessoa2 = new Pessoa();
        
        objPessoa2.setNome("Vinicius");
        objPessoa2.setCidade("Lajeado");
        objPessoa2.setIdade(20);
        objPessoa2.setAluno(true);

       
        System.out.println(objPessoa1.toString());
        

        System.out.println(objPessoa2.imprimir());
        
        
        if(objPessoa2.idade < objPessoa1.idade){
            System.out.println("o cliente 1 é mais velho");
        }else{
            if(objPessoa2.idade == objPessoa1.idade){
                System.out.println("os dois clientes tem a mesma idade");
            }else{
                System.out.println("o cliente 2 é mais velho");
            }
        }
        
    }
    
}
