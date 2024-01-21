public class Studente {
    //proprietà classe
    private String nome;
    private String cognome;
    private int identificativo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getIdentificativo() {
        return identificativo;
    }

    public void setIdentificativo(int identificativo) {
        this.identificativo = identificativo;
    }

    public Studente(String nome, String cognome, int identificativo) {     //costruttore classe
        this.nome = nome;
        this.cognome = cognome;
        this.identificativo = identificativo;
    }
    public void verificaInfo() {     //metodo per vedere le info sullo studente
        System.out.println("nome " + nome);
        System.out.println("cognome " + cognome);
        System.out.println("identificativo " + identificativo);


    }


}