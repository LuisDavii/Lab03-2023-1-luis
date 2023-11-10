package linked;

import list.EstruturaElementar;

public class ListaLigada implements EstruturaElementar{

    private No cabeca;

    public ListaLigada() {
        cabeca = null;
    }

    @Override
    public boolean buscaElemento(int valor) {
        No n = this.cabeca;
        while(n!=null){
            if(n.getValor()==valor){
                return true;
            }
            n=n.getProximo();
        }
        return false;
    }

    @Override
    public int buscaIndice(int valor) {
        No n = this.cabeca;
        for(int i=0;i<valor;i++){
            n=n.getProximo(); 
        }
        return n.getValor();
    }

    @Override
    public int minimo() {
        int c = Integer.MAX_VALUE;
        No n = this.cabeca;
        while(n!=null){
            if(c>n.getValor()){
                c=n.getValor();
            }
            n=n.getProximo();
        }
        return c;
    }

    @Override
    public int maximo() {
        int c = Integer.MIN_VALUE;
        No n = this.cabeca;
        while(n!=null){
            if(c<n.getValor()){
                c=n.getValor();
            }
            n=n.getProximo();
        }
        return c;
    }

    @Override
    public int predecessor(int valor) {
        return buscaIndice(valor-1);
    }

    @Override
    public int sucessor(int valor) {
       return buscaIndice(valor+1);
    }

    @Override
    public void insereElemento(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insereElemento'");
    }

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insereElementoPosicao'");
    }

    @Override
    public void insereInicio(int valor) {
        if (this.cabeca==null){
        this.cabeca = new No(valor);    
        }
        else{
            No n = new No(valor);
            n.setProximo(this.cabeca);
            cabeca = n;
        }
        
    }

    @Override
    public void insereFim(int valor) {
        if(cabeca==null){
            cabeca = new No(valor);
        }
        else{
        No n = cabeca;
        while (n.getProximo()!=null) {
            n=n.getProximo();
        }
        n.setProximo(new No(valor));
    }
    }

    @Override
    public void remove(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void removeIndice(int indice) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeIndice'");
    }

    @Override
    public void removeInicio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeInicio'");
    }

    @Override
    public void removeFim() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFim'");
    }
    
}
