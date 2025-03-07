//clase tipo interface donde están declarados los métodos a usar sin su lógica

package servicios;

public interface IDispensador {

    public void setNext(IDispensador handler);
    public void handle(int amount);
    public boolean canDispense(int amount);    

}
