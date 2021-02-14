public class MaquinaAguaConfiguravel {

	final int capacidadeAgua;
	final int capacidadeCopos200;
	final int capacidadeCopos300;
  private int capacidadeAguaFlutuante;
  private int capacidadeCopos200Flutuante;
  private int capacidadeCopos300Flutuante;

	public MaquinaAguaConfiguravel(int capacidadeAgua, int capacidadeCopos200, int capacidadeCopos300) {
    if(capacidadeAgua <= 0) throw new IllegalStateException("Quantidade água deve ser positivo");
    if (capacidadeCopos200 <= 0) throw new IllegalStateException("Copos de 200mL deve ser positivo");
    if (capacidadeCopos300 <= 0) throw new IllegalStateException("Copos de 300mL deve ser positivo");
    this.capacidadeAgua = capacidadeAgua;
    this.capacidadeCopos200 = capacidadeCopos200;
    this.capacidadeCopos300 = capacidadeCopos300;
    this.capacidadeAguaFlutuante = 0;
    this.capacidadeCopos200Flutuante = 0;
    this.capacidadeCopos300Flutuante= 0;
	}

	public int agua() {
		return this.capacidadeAguaFlutuante;
	}

	public int copos200() {
		return this.capacidadeCopos200Flutuante;
	}

	public int copos300() {
		return this.capacidadeCopos300Flutuante;
	}

	public void abastecerAgua() {
    this.capacidadeAguaFlutuante = this.capacidadeAgua;
	}

	public void abastecerCopo200() {
    this.capacidadeCopos200Flutuante = this.capacidadeCopos200;
	}

	public void abastecerCopo300() {
	  this.capacidadeCopos300Flutuante = this.capacidadeCopos300;
  }

	public void servirCopo200() {
    if(!(this.ahCopos200() || this.ahAgua(200))) throw new IllegalStateException("Não há água nem copos de 200mL");
    else if(!this.ahCopos200()) throw new IllegalStateException("Não há copos de 200mL");
    else if (!this.ahAgua(200)) throw new IllegalStateException("Não há água");
    else {
      this.capacidadeCopos200Flutuante  -= 1;
      this.capacidadeAguaFlutuante  -= 200;
    }
  }

  public void servirCopo300() {
    if (!(this.ahCopos300() && this.ahAgua(300))) throw new IllegalStateException("Não há água nem copos de 200mL");
    else if (!this.ahCopos300()) throw new IllegalStateException("Não há copos de 200mL");
    else if (!this.ahAgua(300)) throw new IllegalStateException("Não há água");
    else{
      this.capacidadeCopos300Flutuante -= 1;
      this.capacidadeAguaFlutuante -= 300;
    }
  }
    

  public boolean ahAgua(int mls){
    return this.agua() >= mls;
  }

  public boolean ahCopos200() {
    return this.copos200() > 0;
  }

  public boolean ahCopos300() {
    return this.copos300() > 0;
  }

}
