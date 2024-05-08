public class Main {
    public static void main(String[] args) {
        try {
            Prefeito prefeito = new Prefeito();
            for (int i=0; i<99; i++) {
                new Prefeito();
            }
            prefeito.totalDeVotos();
        }catch (Exception exception){
            System.out.println(exception.getLocalizedMessage());
        }
    }
}