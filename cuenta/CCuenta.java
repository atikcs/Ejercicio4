package cuenta;

/**
 * Esta clase represente una cuenta corriente.
 * @author fran_
 *
 */
public class CCuenta {


	/**
	 * Representa el nombre de la persona titular de la cuenta
	 */
    private String nombre;
    /**
     * Representa de manera inequivoca la cuenta.
     */
    private String cuenta;
    /**
     * Representa el saldo disponible
     */
    private double saldo;
    /**
     * Representa el tipo de interés asociado.
     */
    private double tipoInteres;

    /**
     * Constructor vacío.
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con parámetros
     * @param nom nombre
     * @param cue cuenta
     * @param sal saldo
     * @param tipo tipoInteres
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
   // getters y setters 

    /**
     * Metodo que devuelve el atributo nombre.
     * @return nombre titular de la cuenta
     */
    public String getNombre() {
		return nombre;
	}

    /**
     * Metodo para modificar el atributo nombre.
     * @param nombre nuevo
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el atributo cuenta.
	 * @return cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Metodo para modificar el atributo cuenta
	 * @param cuenta nueva
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Devuelve el valor de saldo
	 * @return saldo disponible
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Metodo para modificar el saldo disponible
	 * @param saldo nuevo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Devuelve el tipo de interes asociado a la cuenta
	 * @return tipoInteres
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Modifica el tipo de interés.
	 * @param tipoInteres nuevo
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	/**
	 * Deveulve el saldo. Igual que getSaldo()
	 * @return saldo disponible
	 */
	public double estado()
    {
        return saldo;
    }

	/**
	 * Metodo que simula el ingreso de una cantidad a la cuenta.   
	 * @param cantidad a ingresar
	 * @throws Exception Se lanza en caso de intentar ingresar una cantidad negativa.
	 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Metodo que simula el reintegro de una cantidad de la cuenta.
     * @param cantidad a retirar
     * @throws Exception Se lanza en caso de intentar retirar una cantidad negativa o superior al saldo disponible.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
