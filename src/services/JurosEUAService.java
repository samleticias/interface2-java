package services;

public class JurosEUAService implements JurosService {

    private double avaliacaoJuros;

    public JurosEUAService(double avaliacaoJuros) {
        this.avaliacaoJuros = avaliacaoJuros;
    }

    @Override
    public double getAvaliacaoJuros() {
        return avaliacaoJuros;
    }
}