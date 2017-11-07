package model;

import java.util.Date;

import javax.persistence.Column;

public class Reservas {

	@Column(name = "id")
	private int reservaId;
	@Column(name = "cliente")
	private String Cliente;
	@Column(name = "quantidadeHospede")
	private int qtqHospede;
	@Column(name = "checkin")
	private Date checkin;
	@Column(name = "checkout")
	private Date checkout;
	@Column(name = "noites")
	private int noites;
	@Column(name = "valor")
	private float valor;
	@Column(name = "quantidadeQuartos")
	private int qtdQuartos;
	@Column(name = "gastosExtras")
	private float gastoExtras;

	public Reservas(int reservaId, String cliente, int qtqHospede, Date checkin, Date checkout, int noites, float valor,
			int qtdQuartos, float gastoExtras) {
		super();
		this.reservaId = reservaId;
		Cliente = cliente;
		this.qtqHospede = qtqHospede;
		this.checkin = checkin;
		this.checkout = checkout;
		this.noites = noites;
		this.valor = valor;
		this.qtdQuartos = qtdQuartos;
		this.gastoExtras = gastoExtras;
	}

	public int getReservaId() {
		return reservaId;
	}

	public void setReservaId(int reservaId) {
		this.reservaId = reservaId;
	}

	public String getCliente() {
		return Cliente;
	}

	public void setCliente(String cliente) {
		Cliente = cliente;
	}

	public int getQtqHospede() {
		return qtqHospede;
	}

	public void setQtqHospede(int qtqHospede) {
		this.qtqHospede = qtqHospede;
	}

	public Date getCheckin() {
		return checkin;
	}

	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}

	public int getNoites() {
		return noites;
	}

	public void setNoites(int noites) {
		this.noites = noites;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getQtdQuartos() {
		return qtdQuartos;
	}

	public void setQtdQuartos(int qtdQuartos) {
		this.qtdQuartos = qtdQuartos;
	}

	public float getGastoExtras() {
		return gastoExtras;
	}

	public void setGastoExtras(float gastoExtras) {
		this.gastoExtras = gastoExtras;
	}

}
