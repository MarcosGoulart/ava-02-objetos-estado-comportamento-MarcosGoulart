

public class Forno {

	public final int volume;
	public final int tensao;
	public final int potencia;
	public final int largura;
	public final int altura;
	public final int profundidade;
	private int temperatura;
	private boolean ligado;
    private int tempo;

	public Forno(int volume, int tensao, int potencia, int largura, int altura, int profundidade) {
        this.volume = volume;
        this.tensao = tensao;
        this.potencia = potencia;
        this.largura = largura;
        this.altura = altura;
        this.profundidade = profundidade;
        this.temperatura = 0;
        this.ligado = false;
        this.tempo = 0;

    }

	public int temperatura() {
		return this.temperatura;
	}

	public boolean ligado() {
		return this.ligado;
	}

	public void aumentarTemperatura() {
        if(!this.ligado){
            this.ligado = true;
            this.temperatura += 50;
        }
        else if(this.temperatura == 200) this.temperatura += 20;
        else if(this.temperatura == 220) this.temperatura += 30;
        else if(this.temperatura == 300);
        else this.temperatura += 50;
	}

	public void diminuirTemperatura() {
        if(this.temperatura == 50){
            this.ligado = false;
            this.temperatura -= 50;
        }
        else if(this.temperatura == 250) this.temperatura -= 30;
        else if(this.temperatura == 220) this.temperatura -= 20;
        else if(this.temperatura == 0);
        else this.temperatura -= 50;
	}

	public void desligar() {
        this.ligado = false;
        this.temperatura = 0;

	}

	public void setTimer(int tempo) {
        this.tempo = tempo;
	}

	public int tempoRestante() {
		return this.tempo;
	}

	public void tick() {
        if(this.tempo == 1) {
            this.ligado = false;
            this.tempo -= 1; 
            this.temperatura = 0;
        } else if (this.tempo == 0);
        else this.tempo -= 1;
    }

}
