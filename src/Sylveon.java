public class Sylveon extends Eevee {
    public Sylveon(String tipo, int altura, int HP, double peso) {
        super(tipo, altura, HP, peso);
    }

    @Override
    public String ataque() {
        return " Moonblast";
    }

    @Override
    public String defesa() {
        return "Cute Charm";
    }

    @Override
    public String especial() {
        return "Pixilate ";
    }

    // metodo imprimir
    @Override
    public void imprimir() {
        System.out.println("Sylveon ");
        System.out.println("  tipo='" + getTipo() + '\'');
        System.out.println("  altura=" + getAltura());
        System.out.println("  HP=" + getHP());
        System.out.println("  peso=" + getPeso());
        System.out.println("  Ataque: " + ataque());
        System.out.println("  Defesa: " + defesa());
        System.out.println("  Especial: " + especial());
    }

}
