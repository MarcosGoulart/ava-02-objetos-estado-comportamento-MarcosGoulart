public class MaquinaAgua {
  int agua;
  int copo200;
  int copo300;
  MaquinaAgua(){
    this.agua = 0;
    this.copo200 = 0;
    this.copo300 = 0;
  }

	public int agua() {
		return this.agua;
	}

	public int copos200() {
		return this.copo200;
	}
  
  public int copos300() {
    return this.copo300;
  }

	public void servirCopo200() {
    if(this.copos200() > 0 && this.agua() >= 200){
      this.copo200 -= 1;
      this.agua -= 200;
    }
	}
  
  public void servirCopo300() {
    if(this.copos300() > 0 && this.agua() >= 300){
      this.copo300 -= 1;
      this.agua -= 300;
    }
  }

	public void abastecerAgua() {
    this.agua = 20000;
	}

	public void abastecerCopo200() {
    this.copo200 = 100;
	}

	public void abastecerCopo300() {
    this.copo300 = 100;
	}

}
