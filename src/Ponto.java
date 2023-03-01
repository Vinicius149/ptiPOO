public class Ponto {
    
    private int x;
    private int y;

 public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

public Ponto()
 {
    this.x = 0;
    this.y = 0;
 }

 public Ponto(int x, int y)
 {
    this.x = x;
    this.y = y;
 }
 
 public boolean verificarIgual(Ponto ponto)
 {
    if(this.x == ponto.x && this.y == ponto.y) {
        return true;
    }
    else
    {
        return false;
    }
 }

 public double calcDist (int x1, int x2, int y1, int y2)
 {
    double distancia = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2 - y1, 2));
    return distancia;
 }
}
