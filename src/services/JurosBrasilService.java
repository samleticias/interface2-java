package services;

public class JurosBrasilService implements JurosService {

    private double avaliacaoJuros;

    public JurosBrasilService(double avaliacaoJuros) {
        this.avaliacaoJuros = avaliacaoJuros;
    }

    @Override
    public double getAvaliacaoJuros() {
        return avaliacaoJuros;
    }
}