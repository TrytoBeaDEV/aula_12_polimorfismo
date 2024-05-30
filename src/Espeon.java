public class Espeon extends Eevee {
    public Espeon(String tipo, int altura, int HP, double peso) {
        super(tipo, altura, HP, peso);
    }

    @Override
    public String ataque() {
        return " Future Sight";
    }

    @Override
    public String defesa() {
        return "Synchronize";
    }

    @Override
    public String especial() {
        return " Magic Bounce";
    }

    // metodo imprimir
    @Override
    public void imprimir() {
        System.out.println("Espeon ");
        System.out.println("  tipo='" + getTipo() + '\'');
        System.out.println("  altura=" + getAltura());
        System.out.println("  HP=" + getHP());
        System.out.println("  peso=" + getPeso());
        System.out.println("  Ataque: " + ataque());
        System.out.println("  Defesa: " + defesa());
        System.out.println("  Especial: " + especial());
    }

}
