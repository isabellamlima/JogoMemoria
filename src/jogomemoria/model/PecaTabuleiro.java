package jogomemoria.model;

public class PecaTabuleiro {

    private int numero;//numero de imagens
    private int idImagem;// cada imagens 
    private int linha;//linha do tabuleiro
    private int coluna;//linha da coluna
    private boolean virado;
    private int qtdColocada;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getIdImagem() {
        return idImagem;
    }

    public void setIdImagem(int idImagem) {
        this.idImagem = idImagem;
    }

    /**
     * @return the linha
     */
    public int getLinha() {
        return linha;
    }

    /**
     * @param linha the linha to set
     */
    public void setLinha(int linha) {
        this.linha = linha;
    }

    /**
     * @return the coluna
     */
    public int getColuna() {
        return coluna;
    }

    /**
     * @param coluna the coluna to set
     */
    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    /**
     * @return the virado
     */
    public boolean isVirado() {
        return virado;
    }

    /**
     * @param virado the virado to set
     */
    public void setVirado(boolean virado) {
        this.virado = virado;
    }

    /**
     * @return the qtdColocada
     */
    public int getQtdColocada() {
        return qtdColocada;
    }

    /**
     * @param qtdColocada the qtdColocada to set
     */
    public void setQtdColocada(int qtdColocada) {
        this.qtdColocada = qtdColocada;
    }

}
