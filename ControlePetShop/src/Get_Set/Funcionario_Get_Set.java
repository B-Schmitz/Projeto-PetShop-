package Get_Set;

public class Funcionario_Get_Set {

    private String Nome;
    private String Cargo;
    private String Sexo;
    private String Endereco;
    private String Email;
    //temporariamente
    private String Idade;
    private String CPF;
    private String Num_Pis;
    private String Telefone;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getIdade() {
        return Idade;
    }

    public void setIdade(String idade) {
        this.Idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNum_Pis() {
        return Num_Pis;
    }

    public void setNum_Pis(String Num_Pis) {
        this.Num_Pis = Num_Pis;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        this.Telefone = telefone;
    }

}
