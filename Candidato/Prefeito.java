public class Prefeito extends Candidato{
    private String prefeito = "Pamella";
    @Override
    public void totalDeVotos() {
        System.out.println(prefeito+" tem "+getVoto()+" votos!");
    }
}
