package Get_Set;

public class Animais_Get_Set {

    private String Proprietario;
    private String Animal;
    private String Nome;
    private String Raca;
    private String Sexo;
    private String Cor;
    private int Idade;
    private int Altura;
    private int Peso;

    public String getProprietario() {
        return Proprietario;
    }

    public void setProprietario(String Proprietario) {
        this.Proprietario = Proprietario;
    }

    public String getAnimal() {
        return Animal;
    }

    public void setAnimal(String Animal) {
        this.Animal = Animal;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getRaca() {
        return Raca;
    }

    public void setRaca(String Raca) {
        this.Raca = Raca;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    @Override
    public String toString() {
        return "\n\n" + "Proprietario = " + Proprietario + "\n Animal = " + Animal + "\n Nome = " + Nome + "\n Raca = " + Raca + "\n Sexo = " + Sexo + "\n Cor = " + Cor + "\n Idade = " + getIdade() + "\n Altura = " + getAltura() + "\n Peso = " + getPeso();
    }

    /**
     * @return the Idade
     */
    public int getIdade() {
        return Idade;
    }

    /**
     * @param Idade the Idade to set
     */
    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    /**
     * @return the Altura
     */
    public int getAltura() {
        return Altura;
    }

    /**
     * @param Altura the Altura to set
     */
    public void setAltura(int Altura) {
        this.Altura = Altura;
    }

    /**
     * @return the Peso
     */
    public int getPeso() {
        return Peso;
    }

    /**
     * @param Peso the Peso to set
     */
    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

}
