public class AC extends Comida {
    private final int plato = 100;
    private int proteinas;
    private int carbohidratos;
    private int vegetales;

    public AC (String tipo, String descripcion, int proteinas, int carbohidratos, int vegetales) {
        super(tipo, descripcion);
        if(verificar(proteinas, carbohidratos, vegetales)) {
            this.proteinas = proteinas;
            this.carbohidratos = carbohidratos;
            this.vegetales = vegetales;
        }
    }

    private boolean verificar(int prote, int vege, int carb) {
        return prote + vege + carb == this.plato;
    }

    public int getCarbohidratos() {
        return carbohidratos;
    }

    public int getProteinas() {
        return proteinas;
    }

    public int getVegetales() {
        return vegetales;
    }

}
