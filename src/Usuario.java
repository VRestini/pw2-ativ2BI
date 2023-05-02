import java.time.LocalDate;

public class Usuario {
    private int codigo;
    private String nome;
    private String senha;
    private int tentAcesso;
    private boolean primAcesso;
    private LocalDate dataInativo;
    private String status;
    private statusUsuario StatusUsu;


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void getSenha(String senha) {
        this.senha = senha;
    }

    public int getTentAcesso() {
        return tentAcesso;
    }

    public void setTentAcesso(int tentAcesso) {
        this.tentAcesso = tentAcesso;
    }

    public boolean isPrimAcesso() {
        return primAcesso;
    }

    public void setPrimAcesso(boolean primAcesso) {
        this.primAcesso = primAcesso;
    }

    public LocalDate getDataInativo() {
        return dataInativo;
    }

    public void setDataInativo(LocalDate dataInativo) {
        this.dataInativo = dataInativo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Usuario(){
        this.senha = "etec#123";
        this.primAcesso = true;
        StatusUsu = statusUsuario.ATIVO;
    }

<<<<<<< HEAD
    public void setSenha(String senha) {
        this.senha = senha;
        this.primAcesso = false;
        this.StatusUsu = statusUsuario.ATIVO;
        this.tentAcesso = 0;
=======
    void senha(String senha) {
        this.senha = senha;
        primAcesso = false;
        StatusUsu = statusUsuario.INATIVO;
>>>>>>> a9426c76131cddefd32a361f7b64c09917a72c69
    }

    void inativ() {
        LocalDate.now();
        StatusUsu = statusUsuario.INATIVO;
        this.primAcesso = false;
    }
    void exib(){
        System.out.println("Código:" + codigo);
        System.out.println("Usuário:" + nome);
        System.out.println("Senha: " + senha);
        System.out.println("Trocar senha:" + primAcesso);
        System.out.println("Status:" + StatusUsu);
    }
    void autenticar(String senha){
        if (StatusUsu == statusUsuario.INATIVO || StatusUsu == statusUsuario.BLOQUEADO) {
            System.out.println("Acesso negado!");
        }
        if (tentAcesso >= 3) {
            StatusUsu = statusUsuario.BLOQUEADO;
            System.out.println("Acesso Negado");
        }
        if (this.senha == senha) {
            tentAcesso = 0;
            System.out.println("Acesso Liberado");
        }
        else{
            tentAcesso = tentAcesso + 1;
            System.out.println("Usuário/senha inválidos");
        }
    }
}

