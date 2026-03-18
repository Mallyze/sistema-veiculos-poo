public class AutomovelTeste {
    public static void main(String[] args) {

        System.out.println("-------------------------------------------------");
        System.out.println("-------------Informacao do veiculo---------------");
        System.out.println("-------------------------------------------------");

        Automovel a1 = new Carro("Preto","2022","Civic","Honda");
        Automovel a2 = new Moto("Verde","2025","Ninja","Kawasaki");

        System.out.println("CARRO:");
        System.out.println(a1);
        System.out.println("-------------------------------------------------");

        System.out.println("MOTO:");
        System.out.println(a2);
        System.out.println("-------------------------------------------------");

    }
}