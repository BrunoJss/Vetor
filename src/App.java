public class App {
    public static void main(String[] args) throws Exception {

    Aluno a1 = new Aluno("Camilo");
    Aluno a2 = new Aluno("Marcos");
    Aluno a3 = new Aluno("Valeria");
    Aluno a4 = new Aluno("Cristina");

    System.out.println(a2.getNome());
    System.out.println(a2.equals(a4));

    Vetor vet = new Vetor();
    vet.add(a1);
    vet.add(99, a3);
    //vet.add(111, a3); //erro simulado

    // System.out.println(vet.toString());
    
    System.out.println(vet.contem(a4));
    System.out.print("Tem a3? ");
    System.out.println(vet.contem(a3));
    vet.remover(99);
    
    System.out.print("Tem a3? ");
    System.out.println(vet.contem(a3));



    }
}
