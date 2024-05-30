public class Glaceon extends Eevee {
    public Glaceon(String tipo, int altura, int HP, double peso) {
        super(tipo, altura, HP, peso);
    }

    @Override
    public String ataque() {
        return "Blizzard";
    }

    @Override
    public String defesa() {
        return "Ice Body";
    }

    @Override
    public String especial() {
        return "Snow Cloak";
    }

    // metodo imprimir
    @Override
    public void imprimir() {
        System.out.println("Glaceon ");
        System.out.println("  tipo='" + getTipo() + '\'');
        System.out.println("  altura=" + getAltura());
        System.out.println("  HP=" + getHP());
        System.out.println("  peso=" + getPeso());
        System.out.println("  Ataque: " + ataque());
        System.out.println("  Defesa: " + defesa());
        System.out.println("  Especial: " + especial());
    }

}
