/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MaquinaDeBilletes
{
    // The price of a ticket from this machine.
    private int precio;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    private int TrainStation;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public MaquinaDeBilletes(int coste)
    {
        precio = coste;
        balance = 0;
        total = 0;
    }

    /**
     * Devuelve el precio del billete.
     */
    public int obtenerPrecio()
    {
        return precio;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int obtenerBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     */
    public void introducirDinero(int cantidad)
    {
        balance = balance + cantidad;
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void imprimirBillete()
    {
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# Linea de Blue J");
        System.out.println("# Billete");
        System.out.println("# " + precio + " centimos.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        balance = 0;
    }
    
    public int getTotal()
    {
        return total;
    }
    public void setPrecio(int coste)
    {
        precio = coste;
    }
    public void rapido()
    {
        System.out.println("Por favor, inserte la cantidad correcta de dinero.");
    }
}



