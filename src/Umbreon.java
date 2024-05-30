public class Umbreon extends Eevee {
    public Umbreon(String tipo, int altura, int HP, double peso) {
        super(tipo, altura, HP, peso);
    }

    @Override
    public String ataque() {
        return "Faint Attack";
    }

    @Override
    public String defesa() {
        return "Synchronize";
    }

    @Override
    public String especial() {
        return "Inner Focus";
    }

    // metodo imprimir
    @Override
    public void imprimir() {
        System.out.println("Umbreon ");
        System.out.println("  tipo='" + getTipo() + '\'');
        System.out.println("  altura=" + getAltura());
        System.out.println("  HP=" + getHP());
        System.out.println("  peso=" + getPeso());
        System.out.println("  Ataque: " + ataque());
        System.out.println("  Defesa: " + defesa());
        System.out.println("  Especial: " + especial());
    }

}
