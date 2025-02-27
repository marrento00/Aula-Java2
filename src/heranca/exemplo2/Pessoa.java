package heranca.exemplo2;

public class Pessoa {
    private String nome;
    private String rua;
    private String cidade;
    private String bairro;
    private String telefone;

    public Pessoa(String nome, String rua, String cidade, String bairro, String telefone) {
        this.nome = nome;
        this.rua = rua;
        this.cidade = cidade;
        this.bairro = bairro;
        this.telefone = telefone;
    }
    public Pessoa(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return
                "nome = " + nome +
                ", rua = " + rua +
                ", cidade = " + cidade +
                ", bairro = " + bairro +
                ", telefone = " + telefone;
    }
}
