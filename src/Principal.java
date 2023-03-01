import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        
        Ponto Ponto = new Ponto();
   

    double distancia = Ponto.calcDist(2, 1, 3, 2);

    JOptionPane.showMessageDialog(null, "A distância entre os dois pontos é: " +distancia);


    }
}
