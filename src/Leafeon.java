public class Leafeon extends Eevee {
    public Leafeon(String tipo, int altura, int HP, double peso) {
        super(tipo, altura, HP, peso);
    }

    @Override
    public String ataque() {
        return "Giga Drain";
    }

    @Override
    public String defesa() {
        return "Leaf Guard";
    }

    @Override
    public String especial() {
        return "Chlorophyl";
    }

    // metodo imprimir
    @Override
    public void imprimir() {
        System.out.println("Leafeon ");
        System.out.println("  tipo='" + getTipo() + '\'');
        System.out.println("  altura=" + getAltura());
        System.out.println("  HP=" + getHP());
        System.out.println("  peso=" + getPeso());
        System.out.println("  Ataque: " + ataque());
        System.out.println("  Defesa: " + defesa());
        System.out.println("  Especial: " + especial());
    }

}
