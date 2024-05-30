public class Pokedex {
    public static void main(String[] args) throws Exception {

        Eevee e = new Eevee("Normal", 30, 55, 6.5);
        e.imprimir();

        System.out.println("");

        Jolteon j = new Jolteon("Elétrico", 80, 65, 24.5);

        System.out.println("");

        Espeon es = new Espeon("Psíquico", 90, 65, 26.5);
        es.imprimir();

        System.out.println(" ");

        Floreon f = new Floreon("Fogo", 90, 65, 25);
        f.imprimir();

        System.out.println(" ");

        Leafeon l = new Leafeon("Planta", 1, 65, 25.5);
        l.imprimir();

        System.out.println(" ");

        Sylveon s = new Sylveon("Fada", 1, 95, 23.5);
        s.imprimir();

        System.out.println(" ");

        Umbreon u = new Umbreon("Sombrio", 1, 95, 27);
        u.imprimir();

        System.out.println(" ");

        Vaporeon v = new Vaporeon("Água", 1, 130, 29);
        v.imprimir();

        System.out.println("");

        Glaceon g = new Glaceon("Gelo", 80, 65, 25.9);
        g.imprimir();

        System.out.println(" ");

    }
}
