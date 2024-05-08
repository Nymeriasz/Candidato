public abstract class Candidato {
    private static int voto = 0;
    public Candidato() {
        voto ++;
    }
    public abstract void totalDeVotos();
    public static int getVoto() {
        return voto;
    }
}