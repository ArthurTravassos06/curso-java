public class Cliente {

    private static int SEQUENCIAL = 1;

    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String cep;
    
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.id = SEQUENCIAL++;
    }

    public int getId(){
        return id;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void imprimirDadosCliente(){
        System.out.println(getNome());
        System.out.println(getCpf());
        System.out.println(getId());
    }
    
    
    
}
