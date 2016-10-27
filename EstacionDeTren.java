
/**
 * Write a description of class TrainStation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EstacionDeTren
{
    // instance variables - replace the example below with your own
    private MaquinaDeBilletes maquina1;
    private MaquinaDeBilletes maquina2;
    private int dineroTotal;

    /**
     * Constructor for objects of class TrainStation
     */
    public EstacionDeTren()
    {
        // initialise instance variables
        maquina1 = new MaquinaDeBilletes();
        maquina2 = new MaquinaDeBilletes();
        dineroTotal = 0;
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void imprimirDineroTotal()
    {
        // put your code here
        dineroTotal = maquina1.getTotal();
        dineroTotal = dineroTotal + maquina2.getTotal();
        System.out.println(dineroTotal);
    }

    public void imprimirBillete()
    {
        maquina1.introducirDinero(300);
        maquina1.imprimirBillete();
        maquina2.introducirDinero(200);
        maquina2.imprimirBillete();
    }
}

