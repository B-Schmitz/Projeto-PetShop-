package br.pet.getset;

public class AnimalGetSet {

    private String Proprietario;
    private ClienteGetSet cliente;
    private String Animal;
    private String Nome;
    private String Raca;
    private String Sexo;
    private String Cor;
    private int Idade;
    private int Altura;
    private int Peso;

    public ClienteGetSet getCliente() {
        return cliente;
    }

    public void setCliente(ClienteGetSet cliente) {
        this.cliente = cliente;
    }

    public  String getProprietario() {
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

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int Altura) {
        this.Altura = Altura;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return "Proprietário = " + Proprietario + "\n Animal = " + Animal + "\n Nome = " + Nome + "\n Raca = " + Raca + "\n Sexo = " + Sexo + "\n Cor = " + Cor + "\n Idade = " + getIdade() + " anos" + "\n Altura = " + getAltura() + "cm" + "\n Peso = " + getPeso() + "gr";
    }

}
