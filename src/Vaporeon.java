public class Vaporeon extends Eevee {
    public Vaporeon(String tipo, int altura, int HP, double peso) {
        super(tipo, altura, HP, peso);
    }

    @Override
    public String ataque() {
        return "Hydro Pump";
    }

    @Override
    public String defesa() {
        return "Water Absorb ";
    }

    @Override
    public String especial() {
        return "Aurora Beam";
    }

    // metodo imprimir
    @Override
    public void imprimir() {
        System.out.println("Vaporeon ");
        System.out.println("  tipo='" + getTipo() + '\'');
        System.out.println("  altura=" + getAltura());
        System.out.println("  HP=" + getHP());
        System.out.println("  peso=" + getPeso());
        System.out.println("  Ataque: " + ataque());
        System.out.println("  Defesa: " + defesa());
        System.out.println("  Especial: " + especial());
    }

}
