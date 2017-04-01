package Get_Set;

public class Cliente_Get_Set {

    private String Nome;
    private String Endereco;
    private String Sexo;
    private String Email;
    // Temporariamente
    private String CPF;
    private String Telefone;
    private String Idade;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getIdade() {
        return Idade;
    }

    public void setIdade(String Idade) {
        this.Idade = Idade;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "Nome = " + Nome + "Endereço = " + Endereco + "Sexo = " + Sexo + "Email = " + Email + "CPF = " + CPF + "Telefone = " + Telefone + "Idade = " + Idade;
    }

    
    
}
