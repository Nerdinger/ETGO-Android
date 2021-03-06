package POJOS;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Viagem implements Serializable{

	private Integer idViagem;

	private List<Transacao> transacao;

	private List<Passageiro> passageiros;

	private Onibus onibus;

	private Linha linha;

	private Motorista motorista;

	private Date data;

    public Onibus getOnibus() {
        return onibus;
    }

    public void setOnibus(Onibus onibus) {
        this.onibus = onibus;
    }

    public Linha getLinha() {
        return linha;
    }

    public void setLinha(Linha linha) {
        this.linha = linha;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Integer getIdViagem() {
		return idViagem;
	}

	public void setIdViagem(Integer idViagem) {
		this.idViagem = idViagem;
	}

	public List<Transacao> getTransacao() {
		return transacao;
	}

	public void setTransacao(List<Transacao> transacao) {
		this.transacao = transacao;
	}

	public List<Passageiro> getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(List<Passageiro> passageiros) {
		this.passageiros = passageiros;
	}



	public Viagem(Integer idViagem, List<Passageiro> passageiros) {
		this.idViagem = idViagem;
		this.passageiros = passageiros;
	}



	public Viagem(){
		
	}
}
