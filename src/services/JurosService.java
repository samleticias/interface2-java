package services;
import java.security.InvalidParameterException;
public interface JurosService {
    double getAvaliacaoJuros();

    default double pagamento(double valor, int meses) {
        if (meses < 1) {
            throw new InvalidParameterException("Quantidade de meses deve ser maior que zero");
        }
        return valor * Math.pow(1.0 + getAvaliacaoJuros() / 100.0, meses);
    }
}
