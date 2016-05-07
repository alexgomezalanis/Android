package com.example.alejandro.penia5;

/** Handler para listado.
 * @author Ramon Invarato Men�ndez
 * www.jarroba.es
 */
public class Lista_entrada {
	private boolean isMostrarJugador1, isMostrarJugador2;
	private int idImagen1, idImagen2;
	private String nombreJugador1, nombreJugador2;
	private String posicionCampo1, posicionCampo2;
	private String posicionClasificacion1, posicionClasificacion2;
	private String winRate1, winRate2;
	private String ultimo1, ultimo2;

	public Lista_entrada(boolean isMostrarJugador1, boolean isMostrarJugador2) {
		this.isMostrarJugador1 = isMostrarJugador1;
		this.isMostrarJugador2 = isMostrarJugador2;
	}

	public Lista_entrada (boolean isMostrarJugador1, int idImagen1, String nombreJugador1, String posicionCampo1, String posicionClasificacion1, String winRate1, String ultimo1, boolean isMostrarJugador2, int idImagen2, String nombreJugador2, String posicionCampo2, String posicionClasificacion2, String winRate2, String ultimo2) {
	    this.isMostrarJugador1 = isMostrarJugador1;
		this.isMostrarJugador2 = isMostrarJugador2;
		this.idImagen1 = idImagen1;
	    this.nombreJugador1 = nombreJugador1;
	    this.posicionCampo1 = posicionCampo1;
		this.posicionClasificacion1 = posicionClasificacion1;
		this.winRate1 = winRate1;
		this.ultimo1 = ultimo1;
		this.idImagen2 = idImagen2;
		this.nombreJugador2 = nombreJugador2;
		this.posicionCampo2 = posicionCampo2;
		this.posicionClasificacion2 = posicionClasificacion2;
		this.winRate2 = winRate2;
		this.ultimo2 = ultimo2;
	}

	public boolean getIsMostrarJugador1() {return isMostrarJugador1;};

	public boolean getIsMostrarJugador2() {return isMostrarJugador2;};

	public String getnombreJugador1() {
	    return nombreJugador1;
	}
	
	public String getposicionCampo1() {
	    return posicionCampo1;
	}

	public String getPosicionClasificacion1() {	return posicionClasificacion1; }

	public String getUltimo1() {	return ultimo1;	}

	public String getWinRate1() { return winRate1; }

	public int getidImagen1() {
	    return idImagen1;
	}

	public String getnombreJugador2() {
		return nombreJugador2;
	}

	public String getposicionCampo2() {
		return posicionCampo2;
	}

	public String getPosicionClasificacion2() {	return posicionClasificacion2; }

	public String getUltimo2() {	return ultimo2;	}

	public String getWinRate2() { return winRate2; }

	public int getidImagen2() {
		return idImagen2;
	}
}
